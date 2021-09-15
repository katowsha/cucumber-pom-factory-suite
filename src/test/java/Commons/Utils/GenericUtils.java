package Commons.Utils;

import com.cucumber.listener.ExtentCucumberFormatter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class GenericUtils {
    private static Logger log = LogManager.getLogger(GenericUtils.class.getName());


    public static Properties properties;
    public static Map<String,Object> data;
    private static Connection conn = null;


    public static String getCurrentDir(){
        return System.getProperty("user.dir");
    }

    public static void runSetUp(String reportName){
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdfTime = new SimpleDateFormat("-hh-mm");

        Date curDate = new Date();
        String strDate = sdfDate.format(curDate);
        String strTime = sdfTime.format(curDate);

        String fileName = System.getProperty("user.dir").concat("\\target\\Extent_Reports\\").concat(strDate).
                concat("\\"+ reportName).concat(strTime).concat(".html");

        File newFile = new File(fileName);

        ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile);
        ExtentCucumberFormatter.loadConfig(new File(System.getProperty("user.dir").concat("\\src\\test\\resources\\extent-config.xml")));
        ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");

        Map<String, String> systemInfo = new HashMap<>();
        systemInfo.put("Cucumber v","123");
        ExtentCucumberFormatter.addSystemInfo(systemInfo);
    }

    public static void InitializeProperties() {
        properties = new Properties();
        try {
            properties.load(new FileReader("application.properties"));
        } catch (IOException e) {
            log.error(e.getMessage(),e.getCause());
        }
    }
    public static void InitializeJsonData(){
        JSONParser jp = new JSONParser();

        try {
            FileReader reader = new FileReader("data.json");
            Object obj = jp.parse(reader);

             data = (Map) obj;

        } catch (FileNotFoundException e){
            log.error(e.getMessage(),e.getCause());
        } catch (IOException e){
            log.error(e.getMessage(),e.getCause());
        } catch (ParseException e){
            log.error(e.getMessage(),e.getCause());
        }
    }

    public static float getPriceByFormattedString(String price){
        return Float.parseFloat(price.substring(1,price.length()-1).replace(",",""));
    }

    public static void setUpDBConnection(){

        String driver = GenericUtils.properties.getProperty("driver");
        String database = GenericUtils.properties.getProperty("database");
        String hostname = GenericUtils.properties.getProperty("hostname");
        String port = GenericUtils.properties.getProperty("port");

        String username = GenericUtils.properties.getProperty("username");
        String password = GenericUtils.properties.getProperty("password");
        String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            log.error(e.getMessage(),e.getCause());
        }
    }

    public static void printQueryColumnResult(String query,String column){
        ResultSet rs;
        if(conn != null){
            try{
                Statement st = conn.createStatement();
                rs = st.executeQuery(query);
                while(rs.next()){
                    System.out.println(rs.getString(column));
                }
            } catch (SQLException e){
                log.error(e.getMessage(),e.getCause());
            }
        }
    }
}
