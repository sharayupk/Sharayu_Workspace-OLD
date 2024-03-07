package NaveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DynamicWebTableDemoSite 
{

	@Test
	public void handleAlert() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Getting Text of First Name
		String fname=driver.findElement(By.xpath("(//div[@role='rowgroup'])[2]/div/div[2]/div/div[2]")).getText();
		System.out.println(fname);
		
		//Getting Text of Email
		String email=driver.findElement(By.xpath("(//div[@role='rowgroup'])[2]/div/div[2]/div/div[2]/preceding-sibling::div")).getText();
		System.out.println(email);
		
		//double clicking on Action button
		WebElement ele=driver.findElement(By.xpath("(//div[@role='rowgroup'])[2]/div/div[2]/div/div[2]/../../div/div[6]/user-click-select/div[1]/button"));
		Actions action =new Actions(driver);
		action.doubleClick(ele).build().perform();
		
		//Getting no. of rows
		int rows=driver.findElements(By.xpath("(//div[@role='rowgroup'])[2]/div/div")).size();
		System.out.println("Total No. of Rows--->"+rows); //10
		
		//Changing size of Rows 
		Select sc=new Select(driver.findElement(By.xpath("//select")));
		sc.selectByIndex(1);
		
		//Getting no. of rows
	    int rows1=driver.findElements(By.xpath("(//div[@role='rowgroup'])[2]/div/div")).size();
	    System.out.println("Total No. of Rows--->"+rows1); //20
				
		
		
				
		
}
}
