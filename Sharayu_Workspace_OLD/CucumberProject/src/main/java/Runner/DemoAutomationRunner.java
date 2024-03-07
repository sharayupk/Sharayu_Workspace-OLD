package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\java\\Features\\demoAutomation.feature",
		    glue={"StepDefinition"},
		    format = {"pretty", "html:target/DemoAutomation.html","json:target/DemoAutomation.json"})

public class DemoAutomationRunner {

}
