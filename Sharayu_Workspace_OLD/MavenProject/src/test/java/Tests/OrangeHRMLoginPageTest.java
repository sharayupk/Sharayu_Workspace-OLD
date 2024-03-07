package Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.OrangeHRMBase;
import Pages.OrangeHRMHomePage;
import Pages.OrangeHRMLoginPage;


public class OrangeHRMLoginPageTest extends OrangeHRMBase
{
	OrangeHRMLoginPage loginpage;
	OrangeHRMHomePage homepage;
	public OrangeHRMLoginPageTest() throws IOException 
	{
		super();
    }
	
	@BeforeTest
	public void Init() throws IOException
	{
		Initialization();
		loginpage=new OrangeHRMLoginPage();
	}
	
	@Test(priority=0)
	public void loginPageTest()
	{
		//Get Title of Login Page Title
		String loginpageTitle=loginpage.verifyLoginPageTitle();
		System.out.println("Login Page Title---->"+loginpageTitle);
		Assert.assertEquals("OrangeHRM", loginpageTitle);
	}
	
	@Test(priority=1)
	public void verifyLogin() throws IOException 
	{
		//Login to application with valid credentials
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

}
