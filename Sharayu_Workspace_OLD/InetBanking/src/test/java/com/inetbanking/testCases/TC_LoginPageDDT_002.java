package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilities.XLUtils;

public class TC_LoginPageDDT_002 extends BaseClass{
	
	@Test(dataProvider="loginData")
	public void loginTestDDT(String uid,String pwd) throws InterruptedException
	{
	
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(uid);
	logger.info("Entered Username");
	
	lp.setPassword(pwd);
	logger.info("Entered Username");
	lp.clickLoginBtn();
	
	Thread.sleep(3000);
	
	if(isAlertPresent()==true)
	{
		driver.switchTo().alert().accept();//close alert
		driver.switchTo().defaultContent();
		Assert.assertTrue(false);
		logger.warn("Login failed"); 
		
	}
	else
	{
		Assert.assertTrue(true);
		logger.info("Login passed");
		lp.clickLogoutBtn();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();//close logout alert
		driver.switchTo().defaultContent();
	}
	}
	
	
	public boolean isAlertPresent()    //user defined method created to check alert is presetn or not
	{   
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e){
			System.out.println(e.getMessage());
			
		}
		return false;
		
	}

	
	@DataProvider(name="loginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getColCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	}
}
