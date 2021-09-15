package Suite.Models.Locators.Microsoft;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DetailPageLocators extends MicrosoftBaseLocators {

    @FindBy(how= How.XPATH, using = "//div[@id='rootContainer_BuyBox']//span[contains(text(),'$')]")
    public WebElement detailItemPrice;

    @FindBy(how= How.XPATH, using = "//div[@id='rootContainer_BuyBox']//a")
    public WebElement addToCartButton;
}
