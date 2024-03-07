package AutomationPractice;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyDropDownText 
{
	@Test
	public void drpDownExample() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);

		String exp[]= {"Bing","Google","Iphone","Yahoo"};

		Select sc=new Select(driver.findElement(By.id("first")));
		List<WebElement>list=sc.getOptions();

		for(WebElement ele:list)
		{
			boolean flag=false;
			
			for(int i=0;i<=exp.length;i++)
			{   
				String data=ele.getText();
				System.out.println(data);
				
				if(data.equals(exp[i]))
				{
					flag=true;
				}
            }
			Assert.assertTrue(flag,ele.getText());
		}
	}
}
