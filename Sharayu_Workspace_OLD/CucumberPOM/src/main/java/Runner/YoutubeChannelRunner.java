package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {".\\src\\test\\java\\Features\\YoutubeChannel.feature"},
		glue= {"StepDefinition"},
		format= {"pretty","html:target/YoutubeChannel.html"}
		)
public class YoutubeChannelRunner 
{

}
