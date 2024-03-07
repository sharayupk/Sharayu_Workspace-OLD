package com.inetbanking.testCases;

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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();

	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getuserName();
	public String password = readconfig.getPassword();

	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void launchBrowser(String br) {
		//Logger logger = Logger.getLogger("ebanking");
		//PropertyConfigurator.configure("Log4j.proerties");
		 logger=LogManager.getLogger(BaseClass.class);
		

		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + readconfig.getchromepath());
			driver = new ChromeDriver();
		} else if (br.equals("firefox")) {
			System.setProperty("webdriver.firefox.marionette",
					System.getProperty("user.dir") + readconfig.getfirefoxpath());
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(src, target);
		
		
		System.out.println("Screenshot taken");

	}

}
