package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DemoAutomationStepDef 
{
    WebDriver driver;
	@Given("^chrome is launched$")
	public void chrome_is_launched()  
	{
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();	
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@Given("^application is opened$")
	public void application_is_opened() 
	{
	    driver.get("http://demo.automationtesting.in/Register.html");
	}

	@When("^user fills fname and lname$")
	public void user_fills_fname_and_lname() 
	{
	    driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Gayatri");
	    driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Pradhan");
	    
	}

	@When("^user enters address and email and phone$")
	public void user_enters_address_and_email_and_phone() 
	{
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("gayatri@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("7865437865");
	}
	

	@Then("^user clicks on gender and hobbies$")
	public void user_clicks_on_gender_and_hobbies() 
	{
		driver.findElement(By.xpath("//input[@ng-model='radiovalue']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		
		//Scroll down the Page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,500)");

	}
	

	@Then("^user selects languages and skills and country$")
	public void user_selects_languages_and_skills_and_country() throws InterruptedException 
	{   
		//Selects Language as "English"
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		List<WebElement>list=driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete ui-front ui-menu ui-widget')]//li"));
		System.out.println("Size of All Elements---->"+list.size());
		
		for(int i=0;i<=list.size();i++)
		{   
			Thread.sleep(2000);
			WebElement ele=list.get(i);
			String langText=ele.getText();
			System.out.println("List of Languages----."+langText);
			
			if(langText.equals("English"))
			{
				ele.click();
				break;
			}
		}
		
				
		//Selects Skill as "Engineering"
		Select skilldrp=new Select(driver.findElement(By.id("Skills")));
		skilldrp.selectByVisibleText("Engineering");
		
		//Select Country as "India"
		Select countrydrp=new Select(driver.findElement(By.id("countries")));
		countrydrp.selectByVisibleText("India");
		Thread.sleep(2000);
		
	}

	@Then("^enters country$")
	public void enters_country() 
	{
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(Keys.ENTER);
	}

	@Then("^selects year and month and day$")
	public void selects_year_and_month_and_day() 
	{
	    //Select Year
		Select yeardrp=new Select(driver.findElement(By.id("yearbox")));
		yeardrp.selectByVisibleText("1990");
		
		//Select Month
		Select monthdrp=new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
		monthdrp.selectByVisibleText("March");
		
		//Select Day
		Select daydrp=new Select(driver.findElement(By.id("daybox")));
		daydrp.selectByVisibleText("20");
		
	}

	@Then("^fills password and conpassword$")
	public void fills_password_and_conpassword() 
	{
		driver.findElement(By.id("firstpassword")).sendKeys("Gayatri@12");
		driver.findElement(By.id("secondpassword")).sendKeys("Gayatri@12");
	}

	@Then("^clicks on submit button$")
	public void clicks_on_submit_button() 
	{
		driver.findElement(By.id("submitbtn")).click();
	}

	@Then("^validates title of the page$")
	public void validates_title_of_the_page() 
	{
	    String title=driver.getTitle();
	    System.out.println("After Submitting Form Title---->"+title);
	    Assert.assertEquals(title, "Register");
    }
}
