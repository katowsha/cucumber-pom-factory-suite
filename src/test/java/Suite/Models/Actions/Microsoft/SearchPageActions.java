package Suite.Models.Actions.Microsoft;

import Suite.Models.Actions.BaseActions;
import Suite.Models.Locators.Microsoft.SearchPageLocators;
import Framework.Selenium.SeleniumDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchPageActions extends BaseActions {

    public SearchPageLocators locators;

    public SearchPageActions(){
        locators = new SearchPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }


}
