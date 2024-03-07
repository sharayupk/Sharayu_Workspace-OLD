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

public class VerifyDropDownData 
{
	@Test
	public void verifyText() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		String exp[]= {"Banana","Apple","Orange","Grape"};
		Select sc=new Select(driver.findElement(By.id("fruits")));
		List<WebElement>list=sc.getOptions();
		
		for(WebElement ele:list)
		{
			boolean flag=false;
			
			for(int i=0;i<exp.length;i++)
			{
				if(ele.getText().equals(exp[i]))
				{
					flag=true;
				}
			}
			System.out.println(ele.getText());
			Assert.assertTrue(flag,ele.getText());
			
		}
		
		
	}
}
