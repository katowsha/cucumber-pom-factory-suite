package Suite.Steps.Microsoft;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import Suite.Models.Actions.Microsoft.DetailPageActions;
import Suite.Steps.BaseSteps;
import Commons.Utils.GenericUtils;
import Framework.Selenium.SeleniumDriver;

public class DetailPageSteps extends BaseSteps {

    protected DetailPageActions detailPageActions;

    public DetailPageSteps(){
        super();
        detailPageActions = new DetailPageActions();
    }

    @Then("^I should see same price on detail section$")
    public void i_should_see_same_price_on_detail_section() throws Throwable {
        float detailPrice = GenericUtils.getPriceByFormattedString(detailPageActions.locators.detailItemPrice.getText());
        Assert.assertTrue((float)GenericUtils.data.get("firstPrice") == detailPrice);
    }

    @When("^I add this item to the shopping cart$")
    public void i_add_this_item_to_the_shopping_cart() throws Throwable {
        SeleniumDriver.WaitForElementToBeClickable(detailPageActions.locators.signUpModalCloseButton);
        detailPageActions.locators.signUpModalCloseButton.click();
        detailPageActions.locators.addToCartButton.click();
    }

    @When("^I click navigate to shopping cart section$")
    public void i_click_navigate_to_shopping_cart_section() throws Throwable {
        SeleniumDriver.WaitForLoadIcon(detailPageActions.locators.spinnerElement);
        //detailPageActions.locators.shoppingCartIcon.click(); page does it by itself
    }
}
