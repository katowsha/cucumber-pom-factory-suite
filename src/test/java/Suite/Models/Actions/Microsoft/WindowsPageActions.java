package Suite.Models.Actions.Microsoft;

import Suite.Models.Actions.BaseActions;
import Suite.Models.Locators.Microsoft.WindowsPageLocators;
import Framework.Selenium.SeleniumDriver;
import org.openqa.selenium.support.PageFactory;

public class WindowsPageActions extends BaseActions {

    public WindowsPageLocators locators;

    public WindowsPageActions() {
        locators = new WindowsPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }
}
