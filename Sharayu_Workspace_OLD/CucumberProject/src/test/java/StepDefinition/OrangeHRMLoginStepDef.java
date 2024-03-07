package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class OrangeHRMLoginStepDef 
{
	WebDriver driver;
	@Given("^browser launch$")
	public void browse_launched()  
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@Then("^verify title of login page$")
	public void verify_title_of_login_page()  
	{
		String loginPageTitle=driver.getTitle();
		System.out.println("Login Page Title---->"+loginPageTitle);
		Assert.assertEquals(loginPageTitle,"OrangeHRM");
	}

	@Then("^enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enters_and(String username, String password)  
	{
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@Then("^login button is clicked$")
	public void login_button_is_clicked() 
	{
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^validate home page title$")
	public void validate_home_page_title() 
	{
		String homePageTitle=driver.getTitle();
		System.out.println("Login Page Title---->"+homePageTitle);
		Assert.assertEquals(homePageTitle,"OrangeHRM");
	}
}
