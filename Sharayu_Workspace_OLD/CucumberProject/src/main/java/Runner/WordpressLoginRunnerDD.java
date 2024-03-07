package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\src\\test\\java\\Features\\WordpressLoginDD.feature",
		glue= {"StepDefinition"},
		format= {"pretty","html:target/wordpresslogindd.html","json:target/wordpresslogindd.json"}
		)
public class WordpressLoginRunnerDD {

}
