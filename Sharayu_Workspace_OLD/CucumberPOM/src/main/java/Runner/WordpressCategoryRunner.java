package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\src\\test\\java\\Features\\WordpressCategory.feature",
		glue= {"StepDefinition"},
		format= {"pretty","html:target/WordpressCategory.html","json:target-json/WordpressCategory.json"}
		)
		
public class WordpressCategoryRunner {

}
