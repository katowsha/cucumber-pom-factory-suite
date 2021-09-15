package Suite.Models.Locators.Microsoft;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CartPageLocators extends MicrosoftBaseLocators {

    @FindBy(how= How.CSS, using = "div.item-quantity select")
    public WebElement quantitySelect;

    @FindBy(how= How.CSS, using = "span[itemprop='price']")
    public List<WebElement> pricesOnScreen;
}
