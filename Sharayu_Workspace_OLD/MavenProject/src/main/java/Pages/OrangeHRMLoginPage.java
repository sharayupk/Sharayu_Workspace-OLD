package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.OrangeHRMBase;

public class OrangeHRMLoginPage extends OrangeHRMBase
{    
	 
     @FindBy(id="txtUsername")
     WebElement username;
     
     @FindBy(id="txtPassword")
     WebElement password;
     
     @FindBy(id="btnLogin")
     WebElement loginBtn;
     
     public OrangeHRMLoginPage() throws IOException
     {   
    	 PageFactory.initElements(driver, this);
     }
     
     public String verifyLoginPageTitle()
     {
    	 return driver.getTitle();
     }
     
     public OrangeHRMHomePage login(String userid,String pass) throws IOException
     {
    	 username.sendKeys(userid);
    	 password.sendKeys(pass);
    	 loginBtn.click();
    	 
    	 return new OrangeHRMHomePage();
     }
     
}
