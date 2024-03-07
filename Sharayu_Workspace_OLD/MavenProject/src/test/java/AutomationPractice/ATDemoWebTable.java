package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ATDemoWebTable 
{
	@Test
	public void webtableDemo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		int rows=driver.findElements(By.xpath("(//div[@role='rowgroup'][2])/div/div")).size();
		System.out.println("Total No. of Rows--->"+rows);
		
		for(int i=1;i<=rows;i++)
		{
			String fname=driver.findElement(By.xpath("(//div[@role='rowgroup'][2])/div/div["+i+"]/div/div[2]")).getText();
			System.out.println(fname);
			
			if(fname.equals("test"))
			{   
				Thread.sleep(1000);
				WebElement ele=driver.findElement(By.xpath("(//div[@role='rowgroup'][2])/div/div["+i+"]/div/div[2]/preceding-sibling::div/../../div/div[6]/user-click-select/div[1]/button"));
				
				Actions action=new Actions(driver);
				action.moveToElement(ele).doubleClick().build().perform();
			}
				
		}
		
	}
}
