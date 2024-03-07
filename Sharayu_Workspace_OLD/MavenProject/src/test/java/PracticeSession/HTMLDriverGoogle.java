package PracticeSession;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HTMLDriverGoogle 
{
	@Test
	public void htmlDriverExample() throws InterruptedException, IOException
	{
		//System.setProperty("webdriver.chrome.driver",".\\dri\\chromedriver.exe");
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
}
