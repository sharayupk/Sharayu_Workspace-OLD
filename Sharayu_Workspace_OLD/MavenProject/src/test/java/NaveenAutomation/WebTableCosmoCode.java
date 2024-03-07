package NaveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableCosmoCode 
{
    @Test
	public void handleAlert() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//*[@id="countries"]/tbody/tr[4]/td[2]/strong
		//*[@id="countries"]/tbody/tr[5]/td[2]/strong
		
		//Total No. of Rows
		int rows=driver.findElements(By.tagName("tr")).size();
		System.out.println("Total No. of Rows--->"+rows);
		
		String beforeXpath="//*[@id='countries']/tbody/tr[";
		String afterXpath="]/td[2]/strong";
		
		for(int i=2;i<=rows;i++)
		{
			String countries=driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
			System.out.println(countries);
			
			if(countries.contains("Algeria"))
			{
				driver.findElement(By.xpath("//*[@id='countries']/tbody/tr["+i+"]/td[1]/input")).click();
				break;
			}
				
		}
		

}
}
