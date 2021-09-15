package Suite.Steps.Microsoft;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Suite.Models.Actions.Microsoft.SearchPageActions;
import Suite.Steps.BaseSteps;
import Commons.Utils.GenericUtils;
import Framework.Selenium.SeleniumHelper;

public class SearchPageSteps extends BaseSteps {

    protected SearchPageActions microsoftSearchPageActions;
    private float firstPrice;

    public SearchPageSteps(){
        super();
        microsoftSearchPageActions = new SearchPageActions();

    }

    @Then("^I see three different products$")
    public void i_see_three_different_products() throws Throwable {
        SeleniumHelper.PrintElements(microsoftSearchPageActions.locators.itemPrices,3);
        firstPrice = GenericUtils.getPriceByFormattedString(microsoftSearchPageActions.locators.itemPrices.get(0).getText());
        GenericUtils.data.replace("firstPrice", firstPrice);
        System.out.println(firstPrice);
    }

    @When("^I click on the first product$")
    public void i_click_on_the_first_product() throws Throwable {
        microsoftSearchPageActions.locators.itemPrices.get(0).click();
    }
}
