package NaveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MercuryToursExample 
{
	@Test
	public void handleAlert() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Login with valid credentials
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		//Find A Flight
		Select fromFlight=new Select(driver.findElement(By.name("fromPort")));
		fromFlight.selectByVisibleText("Frankfurt");
		
		Select toFlight=new Select(driver.findElement(By.name("toPort")));
		toFlight.selectByVisibleText("London");
		
		driver.findElement(By.name("servClass")).click();
		
		driver.findElement(By.name("findFlights")).click();
			
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,100)");
		
		driver.findElement(By.name("reserveFlights")).click();
		
		driver.findElement(By.name("passFirst0")).sendKeys("Ankush");
		
		driver.findElement(By.name("passLast0")).sendKeys("Kumar");
		
		driver.findElement(By.name("creditnumber")).sendKeys("123456");
		
		js.executeScript("scroll(0,100)");
		driver.findElement(By.name("buyFlights")).click();
		
		String confText=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/b/font/font/b/font[1]")).getText();
		System.out.println("Confirmation Text--->"+confText);
		
				
		
		
		
		
		
		
		
	}
}
