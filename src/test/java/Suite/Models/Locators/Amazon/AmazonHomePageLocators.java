package Suite.Models.Locators.Amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonHomePageLocators extends AmazonBaseLocators {

    @FindBy(how= How.CSS, using = "a[id='nav-link-accountList']")
    public WebElement hoverMenuElement;

    @FindBy(how= How.CSS, using = "div#nav-flyout-ya-newCust a")
    public WebElement newCustomerLink;
}
