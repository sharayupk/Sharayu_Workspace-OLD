package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MercuryDataTableStepDef
{   
	WebDriver driver;
	@Given("^I have valid set of data and access to Registration Page$")
	public void i_have_valid_set_of_data_and_access_to_Registration_Page() 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@When("^Registration Page is displayed$")
	public void registration_Page_is_displayed() throws InterruptedException 
	{
	    driver.findElement(By.linkText("REGISTER")).click();
	    Thread.sleep(2000);
	}

	@Then("^I enter valid data on page$")
	public void i_enter_valid_data_on_page(DataTable userData) 
	{
		List<List<String>>data=userData.raw();
		
		driver.findElement(By.name("firstName")).sendKeys(data.get(0).get(1).toString());
		driver.findElement(By.name("lastName")).sendKeys(data.get(1).get(1).toString());
		driver.findElement(By.name("phone")).sendKeys(data.get(2).get(1).toString());
		driver.findElement(By.name("userName")).sendKeys(data.get(3).get(1).toString());
		driver.findElement(By.name("email")).sendKeys(data.get(4).get(1).toString());
		driver.findElement(By.name("password")).sendKeys(data.get(5).get(1).toString());
		driver.findElement(By.name("confirmPassword")).sendKeys(data.get(6).get(1).toString());
		
	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws InterruptedException 
	{
	    driver.findElement(By.name("register")).click();
	    Thread.sleep(2000);
	}

	@Then("^Thank you for Registering: should be displayed$")
	public void thank_you_for_Registering_should_be_displayed()  
	{
	    String text=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
	    System.out.println(text);
	}

	@Then("^click on signoff$")
	public void click_on_signoff() 
	{
	    driver.findElement(By.linkText("SIGN-OFF")).click();
	}

	@Then("^close the browser$")
	public void close_the_browser() 
	{
	    driver.close();
	}


}
