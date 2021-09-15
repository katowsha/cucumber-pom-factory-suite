package Suite.Models.Actions.Amazon;

import Commons.Utils.GenericUtils;
import Framework.Selenium.SeleniumDriver;
import Suite.Models.Actions.BaseActions;
import Suite.Models.Locators.Amazon.AmazonHomePageLocators;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.support.PageFactory;
import java.util.Map;

public class AmazonHomePageActions extends BaseActions {
    public AmazonHomePageLocators locators;

    public AmazonHomePageActions(){
        locators = new AmazonHomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void getFakeDataFromApiResponse() {
        Response response;
        JsonPath json;
        Map data;
        boolean failedRequest = true;
        int random_int = (int)Math.floor(Math.random()*(15-1+1)+1);
        String[] fullName;
        while (failedRequest){
            try{
                response= RestAssured.given().
                        when().
                        get(GenericUtils.properties.getProperty("fakeDataApi")+(random_int)).
                        then().contentType(ContentType.JSON).
                        extract().response();
                json = response.jsonPath();
                data = json.get("data");
                fullName = data.get("employee_name").toString().split(" ");
                GenericUtils.data.replace("fakeName", data.get("employee_name").toString());
                GenericUtils.data.replace("fakeEmail", fullName[0].concat(".").concat(fullName[1]).concat("@fake.com"));

                failedRequest = !failedRequest;
            } catch (AssertionError e){
                System.out.println("to many requests known error");
            }

        }



    }
}

