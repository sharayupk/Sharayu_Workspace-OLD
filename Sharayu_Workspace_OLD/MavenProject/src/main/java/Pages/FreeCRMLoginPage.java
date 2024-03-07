package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.FreeCRMBase;

public class FreeCRMLoginPage extends FreeCRMBase{
    
	//Page Elements:OR
	@FindBy(name="email")
	WebElement txtEmail;
	@FindBy(name="password")
	WebElement txtPassword;
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginBtn;
	
	public FreeCRMLoginPage() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}
    
	public String validateLoginPageTitle() 
	{
		return driver.getTitle();
	}
	
	public String validateLoginPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public FreeCRMHomePage login(String un,String pass) throws IOException
	{
		txtEmail.sendKeys(un);
		txtPassword.sendKeys(pass);
		loginBtn.click();
		
		return new FreeCRMHomePage();
	}
}
