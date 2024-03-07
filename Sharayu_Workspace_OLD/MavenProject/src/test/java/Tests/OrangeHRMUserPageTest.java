package Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.OrangeHRMBase;
import Pages.OrangeHRMHomePage;
import Pages.OrangeHRMLoginPage;
import Pages.OrangeHRMUserPage;

public class OrangeHRMUserPageTest extends OrangeHRMBase
{

	OrangeHRMLoginPage loginpage;
	OrangeHRMHomePage homepage;
	OrangeHRMUserPage userpage;

	public OrangeHRMUserPageTest() throws IOException 
	{
		super();
    }
	
	@BeforeTest
	public void Init() throws IOException, InterruptedException
	{
		Initialization();
		
		loginpage=new OrangeHRMLoginPage();
		homepage=new OrangeHRMHomePage();
		userpage=new OrangeHRMUserPage();
		
		//Login to application with valid credentials
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		Thread.sleep(1000);
		//Mouse Hover on Admin Link
		homepage.HoverOnAdminLink();
		
		Thread.sleep(1000);
		//Mouse Hover on user Mgmt Link
		homepage.HoverOnUserMgmtLink();
		
		Thread.sleep(1000);
		//Click on Users Link
		homepage.clickOnUsersLink();
		
		Thread.sleep(1000);
		//Click On Add Button
		userpage=homepage.clickOnAddBtn();
	}
	
	@Test
	public void homePageTest() throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		//Select User Role
		userpage.selectUserRole(prop.getProperty("userrole"));
		
		//Enter Employee Name
		userpage.setEmpName(prop.getProperty("empname"));
		
		//Enter UserName
		userpage.setUserid(prop.getProperty("userid"));
		
		Thread.sleep(1000);
		//Select Status
		userpage.selectStatus(prop.getProperty("status"));
		
		//Click on Save Button
		userpage.clickOnSaveBtn();
		
	}
}
