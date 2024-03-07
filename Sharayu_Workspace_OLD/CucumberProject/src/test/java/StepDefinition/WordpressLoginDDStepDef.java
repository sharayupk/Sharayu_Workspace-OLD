package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class WordpressLoginDDStepDef 
{
    WebDriver driver;
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page()  
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@When("^title of login page is Log In ‹ Wordpress Demo Site at Demo.Center — WordPress$")
	public void title_of_login_page_is_Log_In_Wordpress_Demo_Site_at_Demo_Center_WordPress() 
	{
	    String loginPageTitle=driver.getTitle();
	    System.out.println("Actual Title of Login Page--->"+loginPageTitle);
	    Assert.assertEquals("Log In ‹ Wordpress Demo Site at Demo.Center — WordPress", loginPageTitle);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password)  
	{
	    driver.findElement(By.id("user_login")).sendKeys(username);
	    driver.findElement(By.id("user_pass")).sendKeys(password);
	}

	@Then("^clicks on login button$")
	public void clicks_on_login_button() 
	{
		driver.findElement(By.id("wp-submit")).click();
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() 
	{
		String homePageTitle=driver.getTitle();
	    System.out.println("Actual Title of Home Page--->"+homePageTitle);
	    Assert.assertEquals("Dashboard ‹ Wordpress Demo Site at Demo.Center — WordPress", homePageTitle);
	}
}
