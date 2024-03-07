package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\src\\test\\java\\Features\\OrangeHRMHome.feature",
		glue= {"StepDefinition"},
		format= {"pretty","html:target/orangehrmhome.html","json:target-json/orangehrmhome.json"}
		)

public class OrangeHRMRunner 
{

}
