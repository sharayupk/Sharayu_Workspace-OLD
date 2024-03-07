package DemoQAPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableExample 
{    
	 WebDriver driver;
     @Test
     public void executeWebTable()
     {
    	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
    	 driver=new ChromeDriver();
    	 
    	 driver.get("https://demoqa.com/automation-practice-table/");
    	 driver.manage().window().maximize();
    	 driver.manage().deleteAllCookies();
    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    	 
    	 int rows=driver.findElements(By.xpath("//*[@id='content']/div[2]/table/tbody/tr")).size();
    	 System.out.println("Total No. of Rows---->"+rows);
    	 
    	//*[@id="content"]/div[2]/table/tbody/tr[1]/td[5]
    	//*[@id="content"]/div[2]/table/tbody/tr[2]/td[5]
    	 String beforeXpath="//*[@id=\"content\"]/div[2]/table/tbody/tr[";
    	 String afterXpath="]/td[5]";
    	 
    	 for(int i=1;i<=rows;i++)
    	 {
    		 String rankText=driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
    		 System.out.println(rankText);
    		 
    		 if(rankText.equals("2"))
    		 {
    			//*[@id="content"]/div[2]/table/tbody/tr[2]/td[6]/a
    			 driver.findElement(By.xpath("//*[@id='content']/div[2]/table/tbody/tr["+i+"]/td[6]/a")).click();
    		 }
    	 }
    	 
     }
}
