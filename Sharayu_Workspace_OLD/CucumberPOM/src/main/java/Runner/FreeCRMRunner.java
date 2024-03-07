package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\src\\test\\java\\Features\\FreeCRMContacts.feature",
		glue= {"StepDefinition"},
		format= {"pretty","html:target/FreeCRM.html","json:target-json/FreeCRM.json"}
		)

public class FreeCRMRunner {

}
