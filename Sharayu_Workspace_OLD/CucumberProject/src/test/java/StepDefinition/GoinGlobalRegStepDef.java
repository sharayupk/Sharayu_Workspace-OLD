package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoinGlobalRegStepDef 
{
	WebDriver driver;
	@Given("^browser is launched$")
	public void browser_is_launched()  
	{
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();	
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@Given("^register form is opened$")
	public void register_form_is_sopened() 
	{
	    driver.get("http://www.goinglobal.com/demo-registration-form");
	}



@When("^I enters name as \"([^\"]*)\" and phone as\"([^\"]*)\"$")
public void i_enters_name_as_and_phone_as(String name, String phone)  
{
    driver.findElement(By.id("edit-submitted-name")).sendKeys(name);
    driver.findElement(By.id("edit-submitted-phone")).sendKeys(phone);

    
}

@Then("^I enters organization as\"([^\"]*)\" and department as \"([^\"]*)\" and title as \"([^\"]*)\"$")
public void i_enters_organization_as_and_department_as_and_title_as(String org, String dept, String title)  
{
	driver.findElement(By.id("edit-submitted-organization-university")).sendKeys(org);
	driver.findElement(By.id("edit-submitted-department")).sendKeys(dept);
	driver.findElement(By.id("edit-submitted-title")).sendKeys(title);
}

@Then("^I enters email as \"([^\"]*)\" and comments as \"([^\"]*)\"$")
public void i_enters_email_as_and_comments_as(String email, String comments) 
{
	driver.findElement(By.id("edit-submitted-e-mail-address")).sendKeys(email);
	driver.findElement(By.id("edit-submitted-comments")).sendKeys(comments);
}

@Then("^I clicks on notrobot box and submit button$")
public void i_clicks_on_notrobot_box_and_submit_button() throws InterruptedException
{   
	Thread.sleep(1000);
	WebElement ele=driver.findElement(By.xpath("//iframe[@role='presentation']"));
	driver.switchTo().frame(ele);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[1]")).click();
}


}
