package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MoneyControlDD {
	@Test
	public void getExcel() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		FileInputStream fis = new FileInputStream(".//Excel Sheet//moneycontrolDD.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		System.out.println("Last Row---->" + sh.getLastRowNum());

		for (int i = 1; i <= sh.getLastRowNum(); i++) {
			XSSFRow row = sh.getRow(i);

			int principal = (int) row.getCell(0).getNumericCellValue();
			int rate = (int) row.getCell(1).getNumericCellValue();
			int period = (int) row.getCell(2).getNumericCellValue();
			String days = row.getCell(3).getStringCellValue();
			String frequency = row.getCell(4).getStringCellValue();
			double expMaturityValue = row.getCell(5).getNumericCellValue();

			driver.findElement(By.id("principal")).sendKeys(String.valueOf(principal));
			driver.findElement(By.id("interest")).sendKeys(String.valueOf(rate));
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(period));

			Select daysdrp = new Select(driver.findElement(By.id("tenurePeriod")));
			daysdrp.selectByVisibleText(days);

			Select freqdrp = new Select(driver.findElement(By.id("frequency")));
			freqdrp.selectByVisibleText(frequency);

			// Click on Calculate button
			driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[1]/img")).click();

			String actMaturityValue = driver.findElement(By.xpath("//*[@id='resp_matval']/strong")).getText();
			System.out.println("Maturity value--->" + actMaturityValue);

			if (expMaturityValue == Double.parseDouble(actMaturityValue)) {
				System.out.println("Test Case Passed");
			} else {
				System.out.println("Test Case Failed");
			}

			// Click on Clear button
			driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[2]/img")).click();

		}

	}
}
