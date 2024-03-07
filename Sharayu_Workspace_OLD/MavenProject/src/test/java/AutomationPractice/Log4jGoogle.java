package AutomationPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jGoogle 
{
	@Test
	public void takeScreenshot() throws InterruptedException, IOException
	{   
		Logger logger=LogManager.getLogger(Log4jGoogle.class);
	
		logger.info("Launching Browser");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		logger.info("Browser Launched");
		
		driver.manage().window().maximize();
		logger.info("Browser Window Maximized");
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Take Screenshot Of Google Page
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Sharayu_Workspace\\MavenProject\\Screenshots\\google.png"));
		Thread.sleep(1000);
		logger.info("Screenshot Taken");
		
	}
}
