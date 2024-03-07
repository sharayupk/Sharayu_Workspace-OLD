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

public class DemoRegisterAction {

	public static WebDriver driver;

	public static void openbrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void navigate() {
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void enterfirstname() {
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Akash");

	}

	public static void enterlastname() {
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Sharma");

	}

	public static void enteraddr() {

		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Pune");

	}

	public static void enteremail() {
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("akash@gmail.com");

	}

	public static void enterphone() {
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("3546787654");

	}

	public static void selectgender() {
		driver.findElement(By.xpath("//input[@ng-model='radiovalue']")).click();

	}

	public static void selecthobby() {
		driver.findElement(By.id("checkbox1")).click();

	}

	public static void selectlang() throws InterruptedException {
		driver.findElement(By.id("msdd")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,600)");
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul/li"));
		System.out.println("List of languages--->" + list.size());

		for (int i = 1; i <= list.size(); i++) {
			String text = list.get(i).getText();
			System.out.println("Text of languages--->" + text);
			Thread.sleep(1000);

			if (text.equals("English")) {
				list.get(i).click();
				break;
			}
		}
	}

	public static void selectskills() {
		Select skillsdrp = new Select(driver.findElement(By.id("Skills")));
		skillsdrp.selectByVisibleText("C");
	}

	public static void selectcountry() {
		Select skillsdrp = new Select(driver.findElement(By.id("countries")));
		skillsdrp.selectByVisibleText("India");
	}

	public static void selectcountrylist() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span")).click();
		/*Select sc=new Select(driver.findElement(By.id("country")));
		List<WebElement> list = sc.getOptions();
		System.out.println("List of Country--->" + list.size());

		for (int i = 1; i <= list.size(); i++) {
			String text = list.get(i).getText();
			System.out.println("Text of Country--->" + text);
		}
		Thread.sleep(1000);
		driver.findElement(By.id("select2-country-container")).click(); // Click on list box*/
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("India"); // Enter Country
																								  // value in input
																								 // box
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(Keys.ENTER); // Click on Input box
		Thread.sleep(1000);

	}

	public static void selectyear() {
		Select skillsdrp = new Select(driver.findElement(By.id("yearbox")));
		skillsdrp.selectByVisibleText("1990");
	}

	public static void selectmonth() {
		Select skillsdrp = new Select(driver.findElement(By.xpath("//*[@ng-model='monthbox']")));
		skillsdrp.selectByVisibleText("August");
	}

	public static void selectday() {
		Select skillsdrp = new Select(driver.findElement(By.id("daybox")));
		skillsdrp.selectByVisibleText("15");
	}

	public static void enterpass() {
		driver.findElement(By.id("firstpassword")).sendKeys("Akash@12");

	}

	public static void enterconpass() {
		driver.findElement(By.id("secondpassword")).sendKeys("Akash@12");

	}

	public static void clickonsubmit() {
		driver.findElement(By.id("submitbtn")).click();
	}

}
