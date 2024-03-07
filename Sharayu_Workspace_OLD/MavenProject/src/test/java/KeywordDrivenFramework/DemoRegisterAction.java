package KeywordDrivenFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoRegisterAction 
{
	public static WebDriver driver;

	public static void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\dri\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void navigate()
	{
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	}
	public static void enterfirstname()
	{
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Akash");
	}
	public static void enterlastname()
	{
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Singh");
	}
	public static void enteraddr()
	{
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Pune");
	}
	public static void enteremail()
	{
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("akash@gmail.com");
	}
	public static void enterphone() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("7876548976");
		Thread.sleep(1000);

	}
	public static void selectgender()
	{
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
	}
	public static void selecthobby() throws InterruptedException
	{
		driver.findElement(By.id("checkbox1")).click();

		Thread.sleep(1000);
	}
	public static void selectlang() throws InterruptedException
	{
		driver.findElement(By.id("msdd")).click();

		List<WebElement>options=driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete ui-front ui-menu')]//li//a"));
		for(WebElement ele:options)
		{
			String lang=ele.getText();
			System.out.println("Languages---->"+lang);     //Select English

			if(lang.equals("English"))
			{
				ele.click();
				break;
			}
		}

		Thread.sleep(1000);
	}
	public static void selectskills()
	{
		//Scroll Down the Page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,300)");

		Select skillsdrp=new Select(driver.findElement(By.id("Skills")));
		skillsdrp.selectByVisibleText("C");    //Select C
	}
	public static void selectcountry()
	{
		Select countrydrp=new Select(driver.findElement(By.id("countries")));
		countrydrp.selectByVisibleText("India");   //Select India

	}
	public static void selectcountrylist() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("India");  //Select India
		driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);

		Thread.sleep(1000);
	}
	public static void selectyear()
	{
		Select yeardrp=new Select(driver.findElement(By.id("yearbox")));
        yeardrp.selectByVisibleText("1992");    //Select 1992
	}
	public static void selectmonth()
	{
		Select monthdrp=new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
        monthdrp.selectByVisibleText("May");    //Select May
	}
	public static void selectday()
	{
		Select daydrp=new Select(driver.findElement(By.id("daybox")));
        daydrp.selectByVisibleText("10");    //Select 10
	}
	public static void enterpass()
	{
		driver.findElement(By.id("firstpassword")).sendKeys("Akash@12");
	}
	public static void enterconpass()
	{
		driver.findElement(By.id("secondpassword")).sendKeys("Akash@12");
	}
	public static void clickonsubmit()
	{
		driver.findElement(By.id("submitbtn")).click();

	}


}
