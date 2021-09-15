package Suite.Models.Locators.Microsoft;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SearchPageLocators extends MicrosoftBaseLocators {

    @FindBy(how= How.CSS, using = "ul.c-group.f-active span[itemprop='price']")
    public List<WebElement> itemPrices;
}
