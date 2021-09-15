package Suite.Steps.Amazon;

import Commons.Utils.GenericUtils;
import Suite.Models.Actions.Amazon.AmazonHomePageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonHomePageSteps {

    protected AmazonHomePageActions amazonHomePageActions;
    private String urlEndpoint;

    public AmazonHomePageSteps(){
        super();
        amazonHomePageActions = new AmazonHomePageActions();
        urlEndpoint = GenericUtils.properties.getProperty("amazonSite");

    }

    @Given("^I navigate to amazon site$")
    public void i_navigate_to_amazon_site() throws Throwable {
        amazonHomePageActions.openPage(urlEndpoint);

    }

    @Then("^I navigate to new customer form$")
    public void i_navigate_to_new_customer_form() throws Throwable {
        amazonHomePageActions.hoverAndClickElement(amazonHomePageActions.locators.hoverMenuElement, amazonHomePageActions.locators.newCustomerLink);
    }

    @When("^I get fake data from api response$")
    public void i_get_fake_data_from_api_response() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        amazonHomePageActions.getFakeDataFromApiResponse();
    }

}
