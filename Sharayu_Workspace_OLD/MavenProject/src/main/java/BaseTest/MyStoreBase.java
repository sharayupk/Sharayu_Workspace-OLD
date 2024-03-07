package BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStoreBase 
{
	public static Properties prop;
	public static FileInputStream fis;
	public static WebDriver driver;
	
	public MyStoreBase() throws IOException
	{
		prop=new Properties();
		fis=new FileInputStream(".\\src\\main\\java\\Configuration\\mystore.properties");
		prop.load(fis);
	}
	
	public static void SetUp()
	{
		String url=prop.getProperty("URL");
		String br=prop.getProperty("browsername");
		String path=prop.getProperty("chromepath");
		Long implicit=Long.parseLong(prop.getProperty("IMPLICIT_WAIT"));
		Long pageload=Long.parseLong(prop.getProperty("PAGE_LOAD_TIMEOUT"));
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",path);
			driver=new ChromeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(implicit,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(pageload,TimeUnit.SECONDS);
		
	}
}
