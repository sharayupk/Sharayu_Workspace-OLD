package HybridDrivenFramework;

import java.io.IOException;
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
	public static void enterfirstname() throws IOException
	{   
		String str1=DemoRegisterExcel.InputData(3, 1);
		WebElement fn=driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		fn.sendKeys(str1);
	}
	public static void enterlastname() throws IOException
	{
		String str2=DemoRegisterExcel.InputData(4, 1);
		WebElement ln=driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		ln.sendKeys(str2);

	}
	public static void enteraddr() throws IOException
	{
		String str3=DemoRegisterExcel.InputData(5, 1);
		WebElement addr=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		addr.sendKeys(str3);
	}
	public static void enteremail() throws IOException
	{
		String str4=DemoRegisterExcel.InputData(6, 1);
		WebElement email=driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		email.sendKeys(str4);
	}
	public static void enterphone() throws InterruptedException, IOException
	{
		String str5=DemoRegisterExcel.InputData(7, 1);
		WebElement phone=driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		phone.sendKeys(str5);

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
	public static void selectlang() throws InterruptedException, IOException
	{
		driver.findElement(By.id("msdd")).click();

		String str6=DemoRegisterExcel.InputData(10, 1);

		List<WebElement>options=driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete ui-front ui-menu')]//li//a"));
		for(WebElement ele:options)
		{
			String lang=ele.getText();
			System.out.println("Languages---->"+lang);     //Select English

			if(lang.equals(str6))
			{
				ele.click();
				break;
			}
		}

		Thread.sleep(1000);
	}
	public static void selectskills() throws IOException
	{
		//Scroll Down the Page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,300)");

		String str7=DemoRegisterExcel.InputData(11, 1);
		Select skillsdrp=new Select(driver.findElement(By.id("Skills")));
		skillsdrp.selectByVisibleText(str7);    //Select C
	}
	public static void selectcountry() throws IOException
	{   
		String str8=DemoRegisterExcel.InputData(12, 1);
		Select countrydrp=new Select(driver.findElement(By.id("countries")));
		countrydrp.selectByVisibleText(str8);   //Select India

	}
	public static void selectcountrylist() throws InterruptedException, IOException
	{
		String str9=DemoRegisterExcel.InputData(13, 1);
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys(str9);  //Select India
		driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);

		Thread.sleep(1000);
	}
	public static void selectyear() throws IOException
	{
		String str10=DemoRegisterExcel.InputData(14, 1);
		Select yeardrp=new Select(driver.findElement(By.id("yearbox")));
		yeardrp.selectByVisibleText(str10);    //Select 1993
	}
	public static void selectmonth() throws IOException
	{
		String str11=DemoRegisterExcel.InputData(15, 1);
		Select monthdrp=new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
		monthdrp.selectByVisibleText(str11);    //Select May
	}
	public static void selectday() throws IOException
	{
		String str12=DemoRegisterExcel.InputData(16, 1);
		Select daydrp=new Select(driver.findElement(By.id("daybox")));
		daydrp.selectByVisibleText(str12);    //Select 12
	}
	public static void enterpass() throws IOException
	{
		String str13=DemoRegisterExcel.InputData(17, 1);
		WebElement pass=driver.findElement(By.id("firstpassword"));
		pass.sendKeys(str13);
	}
	public static void enterconpass() throws IOException
	{
		String str14=DemoRegisterExcel.InputData(18, 1);
		WebElement conpass=driver.findElement(By.id("secondpassword"));
		conpass.sendKeys(str14);
	}
	public static void clickonsubmit()
	{
		driver.findElement(By.id("submitbtn")).click();

	}


}
