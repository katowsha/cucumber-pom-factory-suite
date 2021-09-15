package Suite.Models.Locators.Amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;

public class EchoSupportPageLocators extends AmazonBaseLocators{

    @FindBy(how= How.XPATH, using = "//div[@id='links-contain']//a[contains(@class,'accordion')]")
    public List<WebElement> echoSupportElements;
}
