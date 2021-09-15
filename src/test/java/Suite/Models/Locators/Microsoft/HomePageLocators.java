package Suite.Models.Locators.Microsoft;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HomePageLocators extends MicrosoftBaseLocators {

    @FindBy(how= How.CSS, using = "li.single-link.js-nav-menu.uhf-menu-item a.c-uhf-nav-link")
    public List<WebElement> navLinks;

    @FindBy(how= How.ID, using = "uhfLogo")
    public WebElement logo;


}
