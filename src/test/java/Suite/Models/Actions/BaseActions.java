package Suite.Models.Actions;

import Framework.Interfaces.IBaseActions;
import Suite.Models.Locators.Microsoft.MicrosoftBaseLocators;
import Framework.Selenium.SeleniumDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class BaseActions implements IBaseActions {

    private static Logger log = LogManager.getLogger(BaseActions.class.getName());

    public MicrosoftBaseLocators locators;
    public BaseActions() {
        locators = new MicrosoftBaseLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    @Override
    public void openPage(String url){
        log.info("Navigate to -> ".concat(url));
        SeleniumDriver.getDriver().get(url);
    }

    public void hoverAndClickElement(WebElement hover, WebElement click){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            log.error(e.getMessage(),e.getCause());
        }
        Actions act = new Actions(SeleniumDriver.getDriver());
        act.moveToElement(hover).click(click).perform();
        act = null;
    }

}
