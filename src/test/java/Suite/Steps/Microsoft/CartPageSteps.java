package Suite.Steps.Microsoft;

import Commons.Utils.GenericUtils;
import Framework.Selenium.SeleniumDriver;
import Suite.Steps.BaseSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Suite.Models.Actions.Microsoft.CartPageActions;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class CartPageSteps extends BaseSteps {
    protected CartPageActions cartPageActions;

    public CartPageSteps(){
        super();
        cartPageActions = new CartPageActions();
    }

    @Then("^I should see same price on shopping cart section$")
    public void i_should_see_same_price_on_shopping_cart_section() {
        Assert.assertTrue("prices are not the same as product search",cartPageActions.ValidateItemPrices((float) GenericUtils.data.get("firstPrice")));
    }

    @When("^I set twenty products to buy$")
    public void i_set_twenty_products_to_buy() throws Throwable {
        Select sel = new Select(cartPageActions.locators.quantitySelect);
        sel.selectByValue("20");
    }

    @Then("^I should see a correct amount$")
    public void i_should_see_a_correct_amount() throws Throwable {
        SeleniumDriver.WaitForLoadIcon(cartPageActions.locators.spinnerElement);
        //System.out.println(GenericUtils.getPriceByFormattedString(cartPageActions.locators.pricesOnScreen.get(2).getText()));
        //System.out.println((((float) GenericUtils.data.get("firstPrice")) * 20));
        Assert.assertTrue("total item is not calculated as expected",GenericUtils.getPriceByFormattedString(cartPageActions.locators.pricesOnScreen.get(2).getText()) == (((float) GenericUtils.data.get("firstPrice")) * 20));
    }
}
