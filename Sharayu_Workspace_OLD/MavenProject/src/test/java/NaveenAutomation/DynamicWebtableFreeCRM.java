package NaveenAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicWebtableFreeCRM {
	
	@Test
	public void handleWebTable() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Enter valid credentials
		driver.findElement(By.name("email")).sendKeys("sudipadas1988@yahoo.in");
		driver.findElement(By.name("password")).sendKeys("Sudipa@12");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		Thread.sleep(3000);
		
		//Click on Contacts link
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[6]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[5]/td[2]
		
		String beforeXpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		String afterXpath="]/td[2]";
		
		for(int i=1;i<=9;i++)
		{   
			String name=driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
			System.out.println(name);
			
			if(name.contains("CC CC"))
			{
				//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[8]/td[1]/div/input
				driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[1]/div/input")).click();
			}
		}
		
		
		
		
		
	}
}
