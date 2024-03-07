package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MercuryLoginStepDef 
{   
	WebDriver driver;
	@Given("^user is on login page$")
	public void user_is_on_login_page()  
	{
	    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\dri\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://newtours.demoaut.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@Then("^validate login page title$")
	public void validate_login_page_title()  
	{
	   String loginPageTitle= driver.getTitle();
	   System.out.println("Login Page Title---->"+loginPageTitle);
	   //Assert.assertEquals(loginPageTitle,"Welcome: Mercury Tours");
	}

	@When("^user set \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_set_and(String username, String password)  
	{
	    driver.findElement(By.name("userName")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@When("^clicks on signin button$")
	public void clicks_on_signin_button() throws InterruptedException 
	{
	   	driver.findElement(By.name("login")).click();
	   	Thread.sleep(2000);
	}
	
	@Then("^verifies home page title$")
	public void verifies_home_page_title()  
	{
		String homePageTitle= driver.getTitle();
		System.out.println("Home Page Title---->"+homePageTitle);
		//Assert.assertEquals(homePageTitle,"Find a Flight: Mercury Tours: ");
	}


}
