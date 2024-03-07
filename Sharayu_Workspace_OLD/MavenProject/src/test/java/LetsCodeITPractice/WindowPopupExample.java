package LetsCodeITPractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowPopupExample 
{
	@Test
	public void windowPopup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		driver.findElement(By.id("openwindow")).click();
		
		String parent=driver.getWindowHandle();
		System.out.println("Parent window ID----->"+parent);
		
		Set<String>handles=driver.getWindowHandles();
		System.out.println("All window ID----->"+handles.size());
		Iterator<String>it=handles.iterator();
		while(it.hasNext())
		{
			String child=it.next();
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				String childTitle=driver.getTitle();
				System.out.println("Child Title--->"+childTitle);
				Assert.assertEquals("Let's Kode It", childTitle);
				
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/button")).click();
				List<WebElement>list=driver.findElements(By.xpath("(//ul[@class='dropdown-menu'])[1]//li//a"));
				System.out.println("No. of Courses--->"+list.size());
				for(int i=0;i<=list.size();i++)
				{
					WebElement ele=list.get(i);
					String text=ele.getText();
					System.out.println(text);
					
					if(text.contains("Software Testing"))
					{
						ele.click();
						break;
					}
				}
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[2]/button")).click();
				List<WebElement>authorlist=driver.findElements(By.xpath("(//ul[@class='dropdown-menu'])[2]//li//a"));
				System.out.println("No. of Author--->"+authorlist.size());
				for(int i=0;i<=authorlist.size();i++)
				{
					WebElement ele=authorlist.get(i);
					String text=ele.getText();
					System.out.println(text);
					
					if(text.contains("Let's Kode It"))
					{
						ele.click();
						break;
					}
				}
		    }
			}
		    Thread.sleep(1000);
		    driver.switchTo().window(parent);
		    String parentTitle=driver.getTitle();
			System.out.println("Parent Title--->"+parentTitle);
			Assert.assertEquals("Practice | Let's Kode It", parentTitle);
		}
    }

