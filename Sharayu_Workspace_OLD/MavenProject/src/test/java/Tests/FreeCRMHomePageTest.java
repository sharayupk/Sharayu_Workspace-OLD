package Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseTest.FreeCRMBase;
import Pages.FreeCRMContactsPage;
import Pages.FreeCRMHomePage;
import Pages.FreeCRMLoginPage;

public class FreeCRMHomePageTest extends FreeCRMBase
{
    FreeCRMLoginPage loginpage;
    FreeCRMHomePage homepage;
    FreeCRMContactsPage contactspage;
    
	public FreeCRMHomePageTest() throws IOException 
	{
		super();
	}
	
	@BeforeClass
	public void Init() throws IOException
	{
		Initialization();
		loginpage=new FreeCRMLoginPage();
		homepage=new FreeCRMHomePage();

		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void validateHomePageTitleTest()
	{
		String homePageTitle=homepage.validateHomePageTitle();
		System.out.println("Home Page Title====>"+homePageTitle);
		Assert.assertEquals(homePageTitle,"Cogmento CRM","Home Page Title does not match") ;
	}
	
	@Test(priority=2)
	public void validateUserLoggedInTest()
	{
		boolean flag=homepage.validateUserLoggedIn();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void clickOnContactsLinkTest() throws IOException
	{
		contactspage=homepage.clickOnContactsLink();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}


}
