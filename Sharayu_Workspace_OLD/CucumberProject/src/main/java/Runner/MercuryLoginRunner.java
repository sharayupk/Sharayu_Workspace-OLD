package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {".\\src\\test\\java\\Features\\MercuryLogin.feature"},  //path of feature file
		glue= {"StepDefinition"},      //path of Step definition file
		format= {"pretty","html:target/MercuryLogin.html"} //generates different reports
		//monochrome=true,  //displays output in console in readable format
		//strict=true,    //checks whether any step is not defined in Step definition file
		//dryRun=true   //mapping on feature file and Step Definition file
		)
public class MercuryLoginRunner {

}
