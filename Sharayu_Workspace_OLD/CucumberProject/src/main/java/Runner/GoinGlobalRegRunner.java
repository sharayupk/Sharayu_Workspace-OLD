package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\src\\test\\java\\Features\\GoinGlobalReg.feature",
		glue= {"StepDefinition"},
		format= {"pretty","html:target/goinglobal.html","json:target/goinglobal.json"}
		)
public class GoinGlobalRegRunner {

}
