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
import junit.framework.Assert;

public class FreeCRMDealsDatatableStepDef 
{

WebDriver driver;
@Given("^launch browser$")
public void launch_browser()  
{
	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();	
	 driver.get("https://ui.freecrm.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
}

@When("^user enters username and password$")
public void user_enters_username_and_password(DataTable credentials)  
{
   List<List<String>> list=credentials.raw();
   driver.findElement(By.name("email")).sendKeys(list.get(0).get(0));
   driver.findElement(By.name("password")).sendKeys(list.get(0).get(1));
   
}

@Then("^user clicks on login button$")
public void user_clicks_on_login_button()  
{
   driver.findElement(By.xpath("//div[text()='Login']")).click();
}

@Then("^validates title of home page$")
public void validates_title_of_home_page()  
{
    String homepageTitle=driver.getTitle();
    System.out.println("Home Page Title--->"+homepageTitle);
    Assert.assertEquals("Cogmento CRM", homepageTitle);
}

@Then("^clicks on deals link and add new button$")
public void clicks_on_deals_link_and_add_new_button() throws InterruptedException  
{   
	Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Deals']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a[3]/button")).click();
}

@Then("^enters title and probability and amount$")
public void enters_title_and_probability_and_amount(DataTable data)  
{
	 List<List<String>> list1=data.raw();
	 driver.findElement(By.name("title")).sendKeys(list1.get(0).get(0));
	 driver.findElement(By.name("probability")).sendKeys(list1.get(0).get(1));
	 driver.findElement(By.name("amount")).sendKeys(list1.get(0).get(2));

}

@Then("^save button is clicked$")
public void save_button_is_clicked()  
{
	driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/button[2]/i")).click();
}


}

