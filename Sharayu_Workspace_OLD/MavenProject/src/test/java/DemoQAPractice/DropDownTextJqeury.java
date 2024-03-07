package DemoQAPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTextJqeury 
{
	@Test
	public void verifyDropDownText() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectmenu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		WebElement ele=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(ele);
		
		String exp[]= {"Slower","Slow","Medium","Fast","Faster"};
		
		Select sc=new Select(driver.findElement(By.id("speed")));
		List<WebElement>options=sc.getOptions();
		for(WebElement list:options)
		{
			String data=list.getText();
			System.out.println(data);
			boolean match=false;
			
			for(int i=0;i<exp.length;i++)
			{
				
				if(list.getText().equals(exp[i]))
				{
					match=true;
				}
			}
			System.out.println("Drop Down Text--->"+data);
			Assert.assertTrue(match,list.getText());
		}
	}

}
