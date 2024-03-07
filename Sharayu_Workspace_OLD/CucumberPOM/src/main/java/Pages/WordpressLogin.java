package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.WordpressBase;

public class WordpressLogin extends WordpressBase
{   
	@FindBy(id="user_login")
	WebElement txtUsername;
	@FindBy(id="user_pass")
	WebElement txtPassword;
	@FindBy(id="wp-submit")
	WebElement loginBtn;
	
	public WordpressLogin() throws IOException
	{
		PageFactory.initElements(driver,this);
	}
	
	public String verifyLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public void setUsername(String userid)
	{
		txtUsername.sendKeys(userid);
	}
	
	public void setPassword(String pass)
	{
		txtPassword.sendKeys(pass);
	}
	
	public WordpressHomePage clickOnLoginBtn() throws IOException
	{
		loginBtn.click();
		return new WordpressHomePage();
	}




}
