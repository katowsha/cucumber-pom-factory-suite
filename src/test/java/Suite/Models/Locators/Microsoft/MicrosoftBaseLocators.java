package Suite.Models.Locators.Microsoft;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MicrosoftBaseLocators {

    @FindBy(how= How.ID, using = "uhf-shopping-cart")
    public WebElement shoppingCartIcon;

    @FindBy(how= How.ID, using = "search")
    public WebElement searchButton;

    @FindBy(how= How.ID, using = "cli_shellHeaderSearchInput")
    public WebElement searchField;

    @FindBy(how= How.ID, using = "R1MarketRedirect-close")
    public WebElement stayOnUsButton;

    @FindBy(how= How.ID, using = "R1MarketRedirect-1")
    public WebElement redirectBanner;

    @FindBy(how= How.CSS, using = "div#emailSup-modal button.close")
    public WebElement signUpModalCloseButton;

    @FindBy(how= How.CSS, using = "div.spinner-container.buybox-spinner-container.position-fixed")
    public List<WebElement> spinnerElement;
}
