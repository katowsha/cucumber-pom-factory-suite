package Suite.Steps.Amazon;

import Commons.Utils.GenericUtils;
import Suite.Models.Actions.Amazon.EchoSupportPageActions;
import Suite.Steps.BaseSteps;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class EchoSupportPageSteps extends BaseSteps {

    protected EchoSupportPageActions echoSupportPageActions;
    private String[] troubleshotElements;
    public EchoSupportPageSteps(){
        super();
        echoSupportPageActions = new EchoSupportPageActions();
    }

    @Then("^Validate the elements on support section$")
    public void validate_the_elements_on_support_section() {
        troubleshotElements = new String[]{"Getting Started", "Wi-Fi and Bluetooth","Device Software and Hardware","Troubleshooting","Learn More"};
        Assert.assertTrue("Troubleshot elements are not displaying as expected", echoSupportPageActions.ValidateTroubleshotElements(troubleshotElements));
        //GenericUtils.setUpDBConnection();

    }
}
