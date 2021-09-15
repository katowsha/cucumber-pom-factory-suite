package Suite.Models.Actions.Amazon;

import Framework.Selenium.SeleniumDriver;
import Suite.Models.Actions.BaseActions;
import Suite.Models.Locators.Amazon.EchoSupportPageLocators;
import org.openqa.selenium.support.PageFactory;

public class EchoSupportPageActions extends BaseActions {
    public EchoSupportPageLocators locators;

    public EchoSupportPageActions(){
        locators = new EchoSupportPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public boolean ValidateTroubleshotElements(String[] elements) {
        int res = 0;
        for (int i = 0; i < 5; i++) {
            res += locators.echoSupportElements.get(i).isDisplayed() ? 0 : 1;
            res += locators.echoSupportElements.get(i).getText().equals(elements[i]) ? 0 : 1;
        }
        return res == 0;
    }
}
