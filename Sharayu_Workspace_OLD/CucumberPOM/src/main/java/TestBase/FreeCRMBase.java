package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import TestUtils.FreeCRMUtils;

public class FreeCRMBase {
    
	public static WebDriver driver;
	public static Properties prop;
	
	public FreeCRMBase() throws IOException 
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\main\\java\\Configuration\\freecrm.properties");
		prop.load(fis);
	}
	
	public static void Initialization()
	{
		String br=prop.getProperty("browser");
		String driverpath=prop.getProperty("path");
		String url=prop.getProperty("URL");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",driverpath);
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette",driverpath);
			driver=new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(FreeCRMUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(FreeCRMUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
	}

}
