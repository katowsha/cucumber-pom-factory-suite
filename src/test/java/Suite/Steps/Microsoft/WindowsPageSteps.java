package Suite.Steps.Microsoft;

import Suite.Models.Locators.Microsoft.MicrosoftBaseLocators;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Suite.Models.Actions.Microsoft.WindowsPageActions;
import Commons.Utils.GenericUtils;
import Framework.Selenium.SeleniumHelper;

public class WindowsPageSteps extends MicrosoftBaseLocators {

    protected WindowsPageActions windowsPageActions;

    public WindowsPageSteps(){
        super();
        windowsPageActions = new WindowsPageActions();
    }

    @When("^I click on windows menu$")
    public void i_click_on_windows_menu() throws Throwable {
        windowsPageActions.locators.windowsDropDown.click();
    }

    @Then("^I should see elements on drop down$")
    public void i_should_see_elements_on_drop_down() throws Throwable {
        SeleniumHelper.PrintElements(windowsPageActions.locators.dropDownOptions);
    }

    @When("^I search visual studio product$")
    public void i_search_visual_studio_product() throws Throwable {
        windowsPageActions.locators.searchButton.click();
        windowsPageActions.locators.searchField.sendKeys(GenericUtils.data.get("SearchCriteria").toString());
        windowsPageActions.locators.searchButton.click();
        if(windowsPageActions.locators.redirectBanner.isDisplayed()){
            windowsPageActions.locators.stayOnUsButton.click();
        }
    }
}
