package Suite.Models.Locators.Amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TermOfUsePageLocators extends AmazonBaseLocators{

    @FindBy(how= How.CSS, using = "input#helpsearch")
    public WebElement searchBar;

    @FindBy(how= How.XPATH, using = "//h2//a[@class='a-link-normal' and contains(text(),'Echo Support')]")
    public WebElement echoSupportLink;
}
