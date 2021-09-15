package Suite.Models.Actions.Amazon;

import Framework.Selenium.SeleniumDriver;
import Suite.Models.Actions.BaseActions;
import Suite.Models.Locators.Amazon.CreateAccountPageLocators;
import Suite.Models.Locators.Amazon.TermOfUsePageLocators;
import org.openqa.selenium.support.PageFactory;

public class TermsOfUsePageActions extends BaseActions {

    public TermOfUsePageLocators locators;

    public TermsOfUsePageActions(){
        locators = new TermOfUsePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }
}
