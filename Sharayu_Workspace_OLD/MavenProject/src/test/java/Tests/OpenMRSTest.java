package Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.OpenMRSBase;
import Pages.OpenMRSFindPatientPage;
import Pages.OpenMRSLoginPage;
import Pages.OpenMRSRegisterPage;

public class OpenMRSTest extends OpenMRSBase
{
    OpenMRSLoginPage loginpage;
    OpenMRSRegisterPage regpage;
    OpenMRSFindPatientPage findpage;
    
	public OpenMRSTest() throws IOException 
	{
		super();
    }
	
	@BeforeTest
	public void Init() throws IOException
	{
		Initialization();
		loginpage=new OpenMRSLoginPage();
		regpage=new OpenMRSRegisterPage();
		findpage=new OpenMRSFindPatientPage();
		
	}
	
	@Test(priority=1)
	public void verifyLoginPageTest() throws InterruptedException, IOException
	{
		String loginTitle=loginpage.loginPageTitle();
		System.out.println("Login Page Title----."+loginTitle);
		Assert.assertEquals("Login",loginTitle);
		
		regpage=loginpage.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		regpage.clickOnRegisterBtn();
		
		regpage.enterName(prop.getProperty("firstname"), prop.getProperty("middlename"), prop.getProperty("lastname"));
		
		regpage.selectGender();
		
		regpage.selectBirthDate(prop.getProperty("birthday"),prop.getProperty("month") , prop.getProperty("year"));
		Thread.sleep(1000);
		
		regpage.enterAddress();
		
		regpage.enterPhone(prop.getProperty("phone"));
		
		regpage.selectRelation(prop.getProperty("relativesdrp"), prop.getProperty("relative"));
		
		regpage.clickOnConfirm();
		Thread.sleep(2000);
		
		findpage=regpage.clickOnHomeBtn();
		Thread.sleep(1000);
		
		findpage.clickOnFindPatientBtn();
		Thread.sleep(1000);
		
		findpage.SearchPatient(prop.getProperty("patientname"));
		
	}
	

}
