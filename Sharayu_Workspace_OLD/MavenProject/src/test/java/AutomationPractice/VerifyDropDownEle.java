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

public class VerifyDropDownEle 
{
	@Test
	public void alertExample() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/selectmenu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		String exp[]= {"Slower","Slow","Medium","Fast","Faster"};
		
		Select sc=new Select(driver.findElement(By.name("speed")));
		List<WebElement>options=sc.getOptions();
		
		for(WebElement ele:options)
		{
			boolean flag=false;
			
			for(int i=0;i<exp.length;i++)
			{
				if(ele.getText().equals(exp[i]))
				{
					flag=true;
				}
			}
			//Assert.assertTrue(flag, ele.getText());
			System.out.println("Speed ---->"+ele.getText());
		}
		
		
	}
}
