package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {".\\src\\test\\java\\Features\\TutorialsPoint.feature"},
		glue= {"StepDefinition"},
		format= {"pretty","html:target/TutorialsPoint.html"}
		)
public class TutorialsPointRunner {

}
