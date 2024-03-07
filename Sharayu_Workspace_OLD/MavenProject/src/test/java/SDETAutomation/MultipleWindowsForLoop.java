package SDETAutomation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowsForLoop
{
	@Test
	public void multipleWindow() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click(); //Click on Tabbed Button
		
		Set<String>handles=driver.getWindowHandles();
		System.out.println("Window handles--->"+handles);
		
		for(String h:handles)
		{   
			driver.switchTo().window(h);
			String title=driver.getTitle();
			System.out.println("Title :"+title);
			
			if(title.equals("Sakinalium | Home"))
			{
				driver.findElement(By.xpath("//*[@id='container']/header/div/div/div[2]/ul/li[2]/a")).click();
				Thread.sleep(1000);
				driver.close();
			}
			
		}

}
}
