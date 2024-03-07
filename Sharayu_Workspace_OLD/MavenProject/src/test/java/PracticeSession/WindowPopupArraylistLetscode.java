package PracticeSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowPopupArraylistLetscode 
{
	@Test
	public void windowPopupArraylistExample() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);

		driver.findElement(By.id("openwindow")).click();

		String parent=driver.getWindowHandle();
		System.out.println("Parent Window ID---->"+parent);

		Set<String>handles=driver.getWindowHandles();
		System.out.println("All Window ID---->"+handles);

		ArrayList<String>tabs=new ArrayList<>(handles);

		driver.switchTo().window(tabs.get(0));    //Parent Window
		//Get Title of Parent Window
		String parentTitle=driver.getTitle();
		String expTitle="Practice | Let's Kode It";
		System.out.println("Parent Window Title--->"+parentTitle);
		Assert.assertEquals(parentTitle, expTitle);
		
		driver.switchTo().window(tabs.get(1));    //1st Child Window
		
		Thread.sleep(2000);
		
		//Click on Category Drop Down
		driver.findElement(By.xpath("(//button[contains(@class,'btn btn-default btn-lg')])[1]")).click();
		
		List<WebElement>list=driver.findElements(By.xpath("(//ul[@class='dropdown-menu'])[1]/li/a"));
		System.out.println("Size of Drop Down List--->"+list.size());
		
		for(int i=0;i<=list.size();i++)
		{
			WebElement ele=list.get(i);
			String text=ele.getText();
			System.out.println("Text of Values in Drop Down list--->"+text);
			
			if(text.equals("Software Testing (6)"))
			{
				ele.click();
				break;
			}
		}
		driver.close();

	}
}
