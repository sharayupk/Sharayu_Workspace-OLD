package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pages.YoutubeChannelPage;
import Pages.YoutubeResultsPage;
import Pages.YoutubeSearchPage;
import TestBase.YoutubeBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YoutubeChannelStepDef  extends YoutubeBase
{   
	private WebDriver driver;
	
	public YoutubeChannelStepDef() throws IOException 
	{
		super();
	}

	@Given("^open chrome browser with url$")
	public void open_chrome_browser_with_url() 
	{
		YoutubeBase.setUp();
	}

	@When("^search selenium tutorial$")
	public void search_selenium_tutorial() throws InterruptedException, IOException 
	{   
		//Thread.sleep(2000);
		new YoutubeSearchPage(driver).navigateToResultsPage(prop.getProperty("searchText"));
	}

	@When("^click on channel name$")
	public void click_on_channel_name() throws InterruptedException, IOException  
	{   
		Thread.sleep(2000);
		new YoutubeResultsPage(driver).clickOnTextLink();
		
	}

	@Then("^validate channel name$")
	public void validate_channel_name() throws IOException 
	{   
		String homePageTitle=new YoutubeChannelPage(driver).getHomePageTitle();
	    System.out.println("Home Page Title--->"+homePageTitle);
	}

}
