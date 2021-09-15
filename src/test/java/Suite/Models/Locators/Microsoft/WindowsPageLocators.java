package Suite.Models.Locators.Microsoft;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class WindowsPageLocators extends MicrosoftBaseLocators {

    @FindBy(how= How.ID, using = "c-shellmenu_55")
    public WebElement windowsDropDown;

    @FindBy(how= How.CSS, using = "button#c-shellmenu_55 + ul a")
    public List<WebElement> dropDownOptions;

}
