package com.qa.factory;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory 
{
     public WebDriver driver;
     
     public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<>();
     
     /**
 	 * This method is used to initialize the threadlocal driver on the basis of given
 	 * browser
 	 * 
 	 * @param browser
     * @return 
 	 * @return this will return tldriver.
     */
     
     public WebDriver init_driver(String browser)
     {
    	 System.out.println("Browser value ===>"+browser);
    	 
    	 if(browser.equals("chrome"))
    	 {
    		 WebDriverManager.chromedriver().setup();
    	 }
    	 else if(browser.equals("firefox"))
    	 {
    		 WebDriverManager.firefoxdriver().setup();
    	 }
    	 else
    	 {
    		 System.out.println("Please pass the correct browser value: " + browser);
    	 }
    	 
    	 getDriver().manage().deleteAllCookies();
 		 getDriver().manage().window().maximize();
 		 return getDriver();

     }
     
     /**
 	 * this is used to get the driver with ThreadLocal
 	 * 
 	 * @return
 	 */
 	public static synchronized WebDriver getDriver() {
 		return tldriver.get();
 	}
}
