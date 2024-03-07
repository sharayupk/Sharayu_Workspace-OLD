package PracticeSession;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jAlertRediff 
{
	@Test
	public void log4jAlertExample() throws InterruptedException
	{
		
		Logger logger=LogManager.getLogger(Log4jAlertRediff.class);
		
		logger.info("Launching Browser");
		System.setProperty("webdriver.chrome.driver",".\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		logger.info("Launching URL");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		logger.info("Maximizing Browser");
		driver.manage().window().maximize();
        
		logger.info("Clicking on Sign In Button");
		//Click on Sign In Button
		driver.findElement(By.name("proceed")).click();
        
		logger.info("Switching To Alert");
		//Switch To Alert
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println("Alert Text=====>"+alertText);

		Thread.sleep(1000);
        
		logger.info("Clicking on OK Button");
		//Click on OK Button
		alert.accept();
	}

}
