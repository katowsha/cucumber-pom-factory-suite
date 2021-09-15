package Suite.Models.Actions.Amazon;

import Framework.Selenium.SeleniumDriver;
import Suite.Models.Actions.BaseActions;
import Suite.Models.Locators.Amazon.AmazonHomePageLocators;
import Suite.Models.Locators.Amazon.CreateAccountPageLocators;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPageActions extends BaseActions {

    public CreateAccountPageLocators locators;

    public CreateAccountPageActions(){
        locators = new CreateAccountPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }
}
