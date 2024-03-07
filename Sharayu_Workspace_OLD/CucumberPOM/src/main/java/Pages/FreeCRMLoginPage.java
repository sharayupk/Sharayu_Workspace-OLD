package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.FreeCRMBase;

public class FreeCRMLoginPage extends FreeCRMBase
{
    @FindBy(name="email")
    WebElement username;
    
    @FindBy(name="password")
    WebElement password;
    
    @FindBy(xpath="//div[text()='Login']")
    WebElement loginBtn;
    
	
	public FreeCRMLoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public String loginPageTitle()
	{
		return driver.getTitle();
	}
	
	public FreeCRMHomePage login(String un,String pass) throws IOException
	{
		username.sendKeys(un);
		password.sendKeys(pass);
		loginBtn.click();
		
		return new FreeCRMHomePage();
	}

}
