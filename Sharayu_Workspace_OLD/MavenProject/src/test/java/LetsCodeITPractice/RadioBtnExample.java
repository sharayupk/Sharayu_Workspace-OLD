package LetsCodeITPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioBtnExample 
{
	@Test
	public void radioBtn() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		boolean radio=driver.findElement(By.id("benzradio")).isSelected();
		System.out.println("Is radio Btn Selected--->"+radio);
		//Assert.assertTrue(radio);
		
		//Click on Radio Btn
		driver.findElement(By.id("benzradio")).click();
		
		radio=driver.findElement(By.id("benzradio")).isSelected();
		System.out.println("Is radio Btn Selected--->"+radio);
		Assert.assertTrue(radio);
		
	}
}
