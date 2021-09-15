package Suite.Models.Actions.Microsoft;

import Suite.Models.Actions.BaseActions;
import Suite.Models.Locators.Microsoft.HomePageLocators;
import Framework.Selenium.SeleniumDriver;
import org.openqa.selenium.support.PageFactory;

public class MicrosoftHomePageActions extends BaseActions {

    public HomePageLocators locators;

    public MicrosoftHomePageActions(){
    locators = new HomePageLocators();
    PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }


    public boolean ValidateNavElements() {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += locators.navLinks.get(i).isDisplayed() ? 0 : 1;
        }
        return res == 0;
    }

    public void clickNavLinkByText(String link) {
        for (int i = 0; i < 6; i++) {
            if(locators.navLinks.get(i).getText().equals(link)){
                locators.navLinks.get(i).click();
                break;
            }
        }
    }
}
