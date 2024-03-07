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

public class PHPTravelsAction {

	public static WebDriver driver;

	public static void openbrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void navigate() {
		driver.get("https://phptravels.org/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	}

	public static void enterfirstname() throws IOException {
		String fn = PHPTravelsExcel.InputData(3, 1);
		driver.findElement(By.id("inputFirstName")).sendKeys(fn);
	}

	public static void enterlastname() throws IOException {
		String ln = PHPTravelsExcel.InputData(4, 1);
		driver.findElement(By.id("inputLastName")).sendKeys(ln);
	}

	public static void enteremail() throws IOException {
		String email = PHPTravelsExcel.InputData(5, 1);
		driver.findElement(By.id("inputEmail")).sendKeys(email);
	}

	public static void selectphone() throws IOException {
		WebElement phonedrp = driver.findElement(By.xpath("//div[@class='selected-flag']"));
		phonedrp.click();
		String ph = PHPTravelsExcel.InputData(6, 1);
		phonedrp.sendKeys(ph);
		phonedrp.sendKeys(Keys.ENTER);
	}

	public static void enterphone() throws IOException {
		String phone = PHPTravelsExcel.InputData(7, 1);
		driver.findElement(By.id("inputPhone")).sendKeys(phone);
	}

	public static void enterstreet() throws IOException {
		String street = PHPTravelsExcel.InputData(8, 1);
		driver.findElement(By.id("inputAddress1")).sendKeys(street);
	}

	public static void entercity() throws IOException {
		String city = PHPTravelsExcel.InputData(9, 1);
		driver.findElement(By.id("inputCity")).sendKeys(city);
	}

	public static void enterstate() throws IOException {
		String state = PHPTravelsExcel.InputData(10, 1);
		driver.findElement(By.id("stateinput")).sendKeys(state);
	}

	public static void enterpincode() throws IOException {
		String pincode = PHPTravelsExcel.InputData(11, 1);
		driver.findElement(By.id("inputPostcode")).sendKeys(pincode);
		// Scroll Down the Page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,400)");

	}

	public static void selectcountry() throws IOException {

		Select countrydrp = new Select(driver.findElement(By.id("inputCountry")));
		List<WebElement> list = countrydrp.getOptions();
		System.out.println("Size of Country List--->" + list.size());
		String countrylist = PHPTravelsExcel.InputData(12, 1);

		for (int i = 1; i <= list.size(); i++) {
			String text = list.get(i).getText();
			System.out.println("Text of Country List---->" + text);

			if (text.equals(countrylist)) {
				list.get(i).click();
				break;
			}
		}
	}

	public static void selectfindus() throws IOException {
		Select findusdrp = new Select(driver.findElement(By.id("customfield1")));
		String findus = PHPTravelsExcel.InputData(13, 1);
		findusdrp.selectByVisibleText(findus);
	}

	public static void entermobile() throws IOException {
		String mobile = PHPTravelsExcel.InputData(14, 1);
		driver.findElement(By.id("customfield2")).sendKeys(mobile);
	}

	public static void clickgeneratepassword() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='containerPassword']/div[4]/div/button")).click();

	}

	public static void enterpasswordlen() throws IOException {
		driver.findElement(By.id("inputGeneratePasswordLength")).clear();
		String passlen = PHPTravelsExcel.InputData(16, 1);
		driver.findElement(By.id("inputGeneratePasswordLength")).sendKeys(passlen);

		// Click on Generate New Password
		driver.findElement(By.xpath("//*[@id='modalGeneratePassword']/div/div/div[2]/div[4]/div/button[1]")).click();

		// Click on Copy to Clipboard and Insert
		driver.findElement(By.id("btnGeneratePasswordInsert")).click();
	}

	public static void clickonrobot() {
		// Switch to Frame
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[1]")).click();
	}

	public static void clickonsubmit() {
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

}
