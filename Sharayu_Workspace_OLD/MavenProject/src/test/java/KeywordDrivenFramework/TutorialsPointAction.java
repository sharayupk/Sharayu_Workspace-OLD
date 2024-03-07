package KeywordDrivenFramework;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TutorialsPointAction 
{
	public static WebDriver driver;
	
	public static void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void navigate()
	{
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	}
	public static void enterfirstname()
	{
		driver.findElement(By.name("firstname")).sendKeys("Shraddha");
	}
	public static void enterlastname()
	{
		driver.findElement(By.name("lastname")).sendKeys("Shah");
	}
	public static void selectgender() throws InterruptedException
	{
		WebElement radioBtn=driver.findElement(By.xpath("//input[@name='sex'][@value='Female']"));
		System.out.println("Radio Button is Displayed---->"+radioBtn.isDisplayed()); //true
		
		System.out.println("Before Selecting Radio Button---->"+radioBtn.isSelected());  //false
		radioBtn.click();
		System.out.println("After Selecting Radio Button---->"+radioBtn.isSelected()); //true
		Thread.sleep(1000);
	}
	public static void selectexp() throws InterruptedException
	{
		//Scroll Down the page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,300)");
		
		driver.findElement(By.xpath("//input[@name='exp'][@value='2']")).click();  //Select 2 Years Exp
		Thread.sleep(1000);
	}
	public static void enterdate() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/form/table/tbody/tr[5]/td[2]/input")).sendKeys("25/05/2020");
		Thread.sleep(1000);
	}
	public static void selectprof() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='profession'][@value='Automation Tester']")).click(); //Select Automation Tester
		Thread.sleep(1000);
	}
	public static void selectfile() throws InterruptedException 
	{
		driver.findElement(By.name("photo")).sendKeys("C:\\Users\\User\\Downloads\\FacilityName.xls");
		Thread.sleep(1000);
		
	}
	public static void selectflavours() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='tool'][@value='Selenium Webdriver']")).click();  //Select Selenium Webdriver
		Thread.sleep(1000);
	}
	public static void selectcont() throws InterruptedException
	{
		Select condrp=new Select(driver.findElement(By.name("continents")));
		condrp.selectByVisibleText("Europe");   //Select Europe
		Thread.sleep(1000);
	}
	public static void selectcmd() throws InterruptedException
	{
		Select selcmdrp=new Select(driver.findElement(By.name("selenium_commands")));
		selcmdrp.selectByVisibleText("Navigation Commands");   //Select Navigation Commands
		Thread.sleep(1000);
	}
	public static void clickbutton() throws InterruptedException
	{
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		
	}
	public static void clickalertok() throws InterruptedException
	{
		//Switch to Alert
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert Text---->"+alert.getText());
		Thread.sleep(1000);
		alert.accept();   //Click on OK button
		Thread.sleep(1000);
	}
	public static void handlewindow() throws InterruptedException
	{
		String parent=driver.getWindowHandle();
		System.out.println("Parent Window ID----->"+parent);
		
		Set<String>handles=driver.getWindowHandles();
		System.out.println("Size of All Window Handles--->"+handles.size());
		Iterator<String>it=handles.iterator();
		while(it.hasNext())
		{
			String child=it.next();
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				
				driver.findElement(By.id("gsc-i-id1")).sendKeys("selenium");
				
				driver.close();
				
			}
		}
		
		driver.switchTo().window(parent);
		String actURL=driver.getCurrentUrl();
		Assert.assertEquals(actURL, "https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		Thread.sleep(1000);
		
		
		
	}

}
