package Framework.Selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumHelper {

    private static Logger log = LogManager.getLogger(SeleniumHelper.class.getName());


    public static void PrintElements(List<WebElement> elements){
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());
        }
    }

    public static void PrintElements(List<WebElement> elements, int top){
        if(elements.size() >= top){
            for (int i = 0; i < top; i++) {
                System.out.println(elements.get(i).getText());
            }
        }
    }
}
