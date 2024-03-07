package Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.FreeCRMBase;
import Pages.FreeCRMHomePage;
import Pages.FreeCRMLoginPage;

public class FreeCRMLoginPageTest extends FreeCRMBase
{
    FreeCRMLoginPage loginpage;
    FreeCRMHomePage homepage;
    
	public FreeCRMLoginPageTest() throws IOException 
	{
		super();
	}
	
	@BeforeClass
	public void Init() throws IOException
	{
		Initialization();
		loginpage=new FreeCRMLoginPage();
	}
	
	@Test(priority=1)
	public void validateLoginPageTitleTest()
	{
		String actualTitle=loginpage.validateLoginPageTitle();
		System.out.println("Login Page Title====>"+actualTitle);
		Assert.assertEquals(actualTitle,"Cogmento CRM","Login Page Title does not match");
	}
	
	@Test(priority=2)
	public void validateLoginPageUrlTest()
	{
		String actualUrl=loginpage.validateLoginPageUrl();
		System.out.println("Login Page Url ===>"+actualUrl);
		Assert.assertEquals(actualUrl,"https://ui.freecrm.com/","Login Page Url does not match");
	}
	
	@Test(priority=3)
	public void loginTest() throws IOException
	{
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	

}
