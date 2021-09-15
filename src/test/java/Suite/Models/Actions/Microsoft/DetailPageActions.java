package Suite.Models.Actions.Microsoft;

import Suite.Models.Actions.BaseActions;
import Suite.Models.Locators.Microsoft.DetailPageLocators;
import org.openqa.selenium.support.PageFactory;
import Framework.Selenium.SeleniumDriver;

public class DetailPageActions extends BaseActions {

    public DetailPageLocators locators;

    public DetailPageActions(){
        locators = new DetailPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }
}
