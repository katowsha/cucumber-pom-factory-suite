package Suite.Runner;

import Commons.Utils.GenericUtils;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        plugin = {"json:target/currentTest/cucumber.json", "pretty", "html:target/negative/cucumber.html","com.cucumber.listener.ExtentCucumberFormatter"},
        features = "src//test/java/Suite/Features",
        glue = {"Suite/Models", "Suite/Steps"},
        tags = {"@MicrosoftTest"}
)
public class MicrosoftUITest extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void setup(){
        GenericUtils.runSetUp("Microsoft-UI-Test");
    }
}

