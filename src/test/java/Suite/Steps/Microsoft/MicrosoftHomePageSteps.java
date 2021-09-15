package Suite.Steps.Microsoft;

import Suite.Models.Actions.Microsoft.MicrosoftHomePageActions;
import io.restassured.RestAssured;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Suite.Steps.BaseSteps;
import Commons.Utils.GenericUtils;
import Framework.Selenium.SeleniumDriver;
import static org.hamcrest.CoreMatchers.*;


public class MicrosoftHomePageSteps extends BaseSteps {

    protected MicrosoftHomePageActions microsoftHomePageActions;
    private String urlEndpoint;


    public MicrosoftHomePageSteps(){
        super();
        microsoftHomePageActions = new MicrosoftHomePageActions();
        urlEndpoint = GenericUtils.properties.getProperty("microsoftSite");
    }

    @Given("^I navigate to microsoft site$")
    public void i_navigate_to_microsoft_site() {
        microsoftHomePageActions.openPage(urlEndpoint);
    }

    @When("^Im on landing page$")
    public void im_on_landing_page() {
    }

    @Then("^I should see nav elements$")
    public void i_should_see_nav_elements() {
        SeleniumDriver.WaitForElementToBeClickable(microsoftHomePageActions.locators.logo);
        Assert.assertTrue(microsoftHomePageActions.ValidateNavElements());
    }

    @When("^I Navigate to \"([^\"]*)\" link$")
    public void i_Navigate_to_link(String arg1) {
        microsoftHomePageActions.clickNavLinkByText(arg1);
    }


}
