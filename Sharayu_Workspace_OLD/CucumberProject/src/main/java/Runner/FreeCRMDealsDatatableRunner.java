package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\src\\test\\java\\Features\\FreeCRMDealsDatatable.feature",
		glue= {"StepDefinition"},
		format= {"pretty","html:target/FreeCRMDealsDatatable.html","json:json-target/FreeCRMDealsDatatable.json"}
		)
public class FreeCRMDealsDatatableRunner {

	}
