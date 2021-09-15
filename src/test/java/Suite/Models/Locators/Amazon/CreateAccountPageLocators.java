package Suite.Models.Locators.Amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CreateAccountPageLocators extends AmazonBaseLocators{

    @FindBy(how= How.ID, using = "ap_customer_name")
    public WebElement customerNameFiled;

    @FindBy(how= How.ID, using = "ap_email")
    public WebElement customerEmailFiled;

    @FindBy(how= How.CSS, using = "div#legalTextRow a")
    public WebElement legalLinksTermsOfUse;
}
