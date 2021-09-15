package Framework.Selenium;

import Commons.Utils.GenericUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumDriver {
    private static Logger log = LogManager.getLogger(SeleniumDriver.class.getName());

    private static SeleniumDriver seleniumDriver;
    private static WebDriver driver;
    private static WebDriverWait waitDriver;
    private final static int TIMEOUT = 10;
    private final static int PAGE_LOAD_TIMEOUT = 120;

    private SeleniumDriver(){
        log.info("Selenium driver initialization....");

        String downloadFilePath = GenericUtils.getCurrentDir().concat("\\downloads");
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("download.default_directory",downloadFilePath);
        ChromeOptions options = new ChromeOptions();

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        waitDriver = new WebDriverWait(driver, TIMEOUT);

        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

        String window = driver.getWindowHandle();
        System.out.println("Window -> ".concat(window));
        log.info(".....Selenium driver initialized");
    }

    private static WebDriverWait getWait(){
        return waitDriver;
    }

    public static void WaitForElementToBeClickable(WebElement we){
        getWait().until(ExpectedConditions.elementToBeClickable(we));
    }

    public static void WaitForLoadIcon(List<WebElement> we){
        int seconds = 0;
        while (we.size() != 0 && seconds < 10){
            try {
                Thread.sleep(1000);
                seconds++;
            } catch (InterruptedException e) {
                log.error(e.getMessage(),e.getCause());
            }
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void setUpDriver(){
        if(seleniumDriver == null){
            seleniumDriver = new SeleniumDriver();
        }
    }

    public static void tearDown(){
        log.info("Selenium driver teardown...");
        if(driver != null){
            driver.close();
            driver.quit();
        }
        seleniumDriver = null;
    }

}
