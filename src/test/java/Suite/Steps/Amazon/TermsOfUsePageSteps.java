package Suite.Steps.Amazon;

import Suite.Models.Actions.Amazon.TermsOfUsePageActions;
import Suite.Models.Locators.Amazon.TermOfUsePageLocators;
import Suite.Steps.BaseSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;

public class TermsOfUsePageSteps extends BaseSteps {

    protected TermsOfUsePageActions termsOfUsePageActions;

    public TermsOfUsePageSteps(){
        super();
        termsOfUsePageActions = new TermsOfUsePageActions();
    }


    @When("^I search for \"([^\"]*)\" on search bar$")
    public void i_search_for_on_search_bar(String search) throws Throwable {
        termsOfUsePageActions.locators.searchBar.sendKeys(search);
        termsOfUsePageActions.locators.searchBar.sendKeys(Keys.ENTER);
    }

    @Then("^I should navigate to Echo Support$")
    public void i_should_navigate_to() throws Throwable {
        termsOfUsePageActions.locators.echoSupportLink.click();

    }
}
