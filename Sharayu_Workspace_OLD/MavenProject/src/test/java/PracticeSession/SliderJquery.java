package PracticeSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderJquery
{
	@Test
	public void sliderExample()
	{
		System.setProperty("webdriver.chrome.driver",".\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();

		//Scroll Down the Page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,200)");

		//Switch To Frame
		driver.switchTo().frame(0);

		WebElement src=driver.findElement(By.id("slider"));
		
		Actions action=new Actions(driver);
		
        action.clickAndHold(src).moveToElement(src).release().build().perform();
		//action.clickAndHold(src).moveByOffset(100,0).build().perform();
	}

}
