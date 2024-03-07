package StepDefinition;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TutorialsPointStepDef 
{   
	static WebDriver driver;
	@Given("^browser is open$")
	public void browser_is_open()  
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	}

	@Then("^user enters firstname and lastname$")
	public void user_enters_firstname_and_lastname() throws InterruptedException  
	{
		driver.findElement(By.name("firstname")).sendKeys("Sakshi");
		Thread.sleep(1000);
		
		driver.findElement(By.name("lastname")).sendKeys("Shah");
		Thread.sleep(1000);
	}

	@When("^user selects gender and experience$")
	public void user_selects_gender_and_experience() throws Throwable 
	{
		WebElement radioBtn=driver.findElement(By.xpath("//input[@name='sex'][@value='Female']"));
		System.out.println("Radio Button is Displayed---->"+radioBtn.isDisplayed()); //true
		
		System.out.println("Before Selecting Radio Button---->"+radioBtn.isSelected());  //false
		radioBtn.click();
		System.out.println("After Selecting Radio Button---->"+radioBtn.isSelected()); //true
		Thread.sleep(1000);
		
		//Scroll Down the page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,300)");
		
		driver.findElement(By.xpath("//input[@name='exp'][@value='2']")).click();  //Select 2 Years Exp
		Thread.sleep(1000);
		
	}

	@When("^enters date$")
	public void enters_date() throws InterruptedException 
	{
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/form/table/tbody/tr[5]/td[2]/input")).sendKeys("28/05/2020");
		Thread.sleep(1000);
	}

	@Then("^user clicks on profession and select file$")
	public void user_clicks_on_profession_and_select_file() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@name='profession'][@value='Automation Tester']")).click(); //Select Automation Tester
		Thread.sleep(1000);
		
		driver.findElement(By.name("photo")).sendKeys("C:\\Users\\User\\Downloads\\FacilityName.xls");
		Thread.sleep(1000);
	}

	@Then("^clicks on flavours of selenium$")
	public void clicks_on_flavours_of_selenium() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@name='tool'][@value='Selenium Webdriver']")).click();  //Select Selenium Webdriver
		Thread.sleep(1000);
	}

	@When("^user picks continents and selenium commands$")
	public void user_picks_continents_and_selenium_commands() throws Throwable 
	{
		Select condrp=new Select(driver.findElement(By.name("continents")));
		condrp.selectByVisibleText("Europe");   //Select Europe
		Thread.sleep(1000);
		
		Select selcmdrp=new Select(driver.findElement(By.name("selenium_commands")));
		selcmdrp.selectByVisibleText("Navigation Commands");   //Select Navigation Commands
		Thread.sleep(1000);
		
	}

	@When("^click on button$")
	public void click_on_button() throws InterruptedException 
	{
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		
	}

	@Then("^handles alert popup$")
	public void handles_alert_popup() throws InterruptedException 
	{
		//Switch to Alert
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert Text---->"+alert.getText());
		Thread.sleep(1000);
		alert.accept();   //Click on OK button
		
		Thread.sleep(1000);
	}

	@Then("^browser window popup is handled$")
	public void browser_window_popup_is_handled() 
	{
		String parent=driver.getWindowHandle();
		System.out.println("Parent Window ID----->"+parent);
		
		Set<String>handles=driver.getWindowHandles();
		System.out.println("Size of All Window Handles--->"+handles.size());
		Iterator<String>it=handles.iterator();
		while(it.hasNext())
		{
			String child=it.next();
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				
				driver.findElement(By.id("gsc-i-id1")).sendKeys("Selenium");
				
				driver.close();
				
			}
		}
	}
}
