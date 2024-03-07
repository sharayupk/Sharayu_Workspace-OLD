package BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BookUKBase 
{
	public static Properties prop;
	public static WebDriver driver;

	public BookUKBase() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\main\\java\\Configuration\\bookuk.properties");
		prop.load(fis);
	}

	public static void Initialization()
	{
		String url=prop.getProperty("URL");
		String br=prop.getProperty("browser");
		String chpath=prop.getProperty("chromepath");
		String ffpath=prop.getProperty("firefoxpath");
		Long implicit=Long.parseLong(prop.getProperty("IMPLICIT_WAIT"));
		Long pageload=Long.parseLong(prop.getProperty("PAGE_LOAD_TIMEOUT"));

		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", chpath);
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.firfox.marionette", ffpath);
			driver=new FirefoxDriver();
		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(implicit, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(pageload, TimeUnit.SECONDS);


	}
}
