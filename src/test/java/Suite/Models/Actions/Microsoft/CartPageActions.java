package Suite.Models.Actions.Microsoft;

import Commons.Utils.GenericUtils;
import Suite.Models.Actions.BaseActions;
import Framework.Selenium.SeleniumDriver;
import org.openqa.selenium.support.PageFactory;
import Suite.Models.Locators.Microsoft.CartPageLocators;

public class CartPageActions extends BaseActions {
    public CartPageLocators locators;

    public CartPageActions(){
        locators = new CartPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public boolean ValidateItemPrices(float price) {
        int res = 0;
        for (int i = 0; i < locators.pricesOnScreen.size()-1; i++) {
            res += GenericUtils.getPriceByFormattedString(locators.pricesOnScreen.get(i).getText()) == price ? 0 : 1;
        }
        return res == 0;
    }
}
