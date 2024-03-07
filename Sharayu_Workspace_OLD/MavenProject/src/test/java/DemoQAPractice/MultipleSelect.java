package DemoQAPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleSelect 
{
	WebDriver driver;
	@Test
    public void executeWindowPopup() throws InterruptedException
    {
   	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
   	 driver=new ChromeDriver();
   	 
   	 driver.get("https://demoqa.com/automation-practice-form/");
   	 driver.manage().window().maximize();
   	 driver.manage().deleteAllCookies();
   	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   	 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
   	 
   	 Select sc=new Select(driver.findElement(By.id("continentsmultiple")));
   	 sc.selectByIndex(0);  //Asia
   	 
   	List<WebElement>options= sc.getOptions();
   	
   	System.out.println(options.size());
   	
   	for(WebElement ele:options)
   	{
   		String text=ele.getText();
   		System.out.println("Text of All Continents--->"+text);
   	}
   	 
   	sc.selectByVisibleText("Africa");    //Africa
   	
   	sc.selectByValue("SA");   //South America
    }
}
