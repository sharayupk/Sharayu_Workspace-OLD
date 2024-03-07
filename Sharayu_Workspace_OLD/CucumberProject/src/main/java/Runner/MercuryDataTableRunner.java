package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {".\\src\\test\\java\\Features\\MercuryDataTable.feature"},
		glue= {"StepDefinition"},
		format= {"pretty","html:target/MercuryDataTable.html"})
public class MercuryDataTableRunner 
{

}
