package Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.BaseWordpress;
import Pages.WordpressAddUserPage;
import Pages.WordpressHomePage;
import Pages.WordpressLoginPage;

public class WordPressTest extends BaseWordpress
{

	public WordPressTest() throws IOException {
		super();
		
	}
	
	@BeforeTest
	public void Init()
	{
		SetUp();
	}
	
	@Test(priority=0)
	public void loginPageTest()
	{
		WordpressLoginPage loginpage=new WordpressLoginPage(driver);
		
		//Enter Login Credentials
		loginpage.setUsername(prop.getProperty("username"));
		loginpage.setPassword(prop.getProperty("password"));
		loginpage.clickOnLoginBtn();
	}
	
	@Test(priority=1)
	public void homePageTest() throws InterruptedException
	{
		WordpressHomePage homepage=new WordpressHomePage(driver);
		
		//validate Title of Homepage
		String hometitle=homepage.homePageTitle();
		System.out.println("Homepage Title---->"+hometitle);
		Assert.assertEquals(hometitle, "Dashboard ‹ Wordpress Demo Site at Demo.Center — WordPress");
		
		Thread.sleep(2000);
		//Mouse Hover on Users Tab
		homepage.mouseHoverOnUsers();
		
		Thread.sleep(2000);
		//Click on Add New User Link
		homepage.clickOnUserLink();
		
	}
	
	@Test(priority=2)
	public void addUserPageTest() throws InterruptedException
	{
		WordpressAddUserPage userpage=new WordpressAddUserPage(driver);
		
		//Validate User Page Title
		String usertitle=userpage.userPageTitle();
		System.out.println("User Page Title---->"+usertitle);
		Assert.assertEquals(usertitle, "Add New User ‹ Wordpress Demo Site at Demo.Center — WordPress");
		
		//Enter Username
		userpage.setUnName(prop.getProperty("unname"));
		Thread.sleep(1000);
		
		//Enter Email
		userpage.setEmail(prop.getProperty("email"));
		Thread.sleep(1000);
		
		//Enter First Name
		userpage.setFirstName(prop.getProperty("fname"));
		Thread.sleep(1000);
		
		//Enter Last Name
		userpage.setLastName(prop.getProperty("lname"));
		Thread.sleep(1000);
		
		//Enter WebSite
		userpage.setWebsite(prop.getProperty("website"));
		Thread.sleep(1000);
		
		//Click on Password Button
		userpage.clickOnPasswordBtn();
		Thread.sleep(1000);
		
		//Enter Text in Password Field
		userpage.setPasswordText(prop.getProperty("passwordtext"));
		Thread.sleep(1000);
		
		//Click on Show Hide Button
		userpage.clickOnShowHideBtn();
		Thread.sleep(1000);
		
		//Click on Cancel Button
		userpage.clickOnCancelBtn();
		Thread.sleep(1000);
		
		//Select Role
		userpage.selectRole(prop.getProperty("role"));
		Thread.sleep(1000);
		
		//Click on Add New User Button
		userpage.clickOnAddNewUserBtn();
	}
	
}

