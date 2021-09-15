package Suite.Steps.Amazon;

import Commons.Utils.GenericUtils;
import Suite.Models.Actions.Amazon.AmazonHomePageActions;
import Suite.Models.Actions.Amazon.CreateAccountPageActions;
import Suite.Steps.BaseSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccountPageSteps extends BaseSteps {

    protected CreateAccountPageActions createAccountPageActions;
    private String customerName;
    private String customerEmail;

    public CreateAccountPageSteps(){
        super();
        createAccountPageActions = new CreateAccountPageActions();
    }

    @Then("^I fill the name and email fields$")
    public void i_fill_the_name_and_email_fields() throws Throwable {
        customerName = GenericUtils.data.get("fakeName").toString();
        customerEmail = GenericUtils.data.get("fakeEmail").toString();
        createAccountPageActions.locators.customerNameFiled.sendKeys(customerName);
        createAccountPageActions.locators.customerEmailFiled.sendKeys(customerEmail);
    }

    @When("^I navigate to condition of use link$")
    public void i_navigate_to_condition_of_use_link() throws Throwable {
        createAccountPageActions.locators.legalLinksTermsOfUse.click();
    }


}
