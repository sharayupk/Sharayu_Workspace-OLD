package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.OpenMRSBase;

public class OpenMRSLoginPage extends OpenMRSBase
{
	@FindBy(name="username")
	WebElement userName;

	@FindBy(name="password")
	WebElement Password;

	@FindBy(id="Inpatient Ward")
	WebElement InpatientWardTab;

	@FindBy(id="loginButton")
	WebElement loginButton;

	public OpenMRSLoginPage() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}

	public String loginPageTitle()
	{
		return driver.getTitle();
	}

	public OpenMRSRegisterPage verifyLogin(String userid,String pass) throws IOException
	{
		userName.sendKeys(userid);
		Password.sendKeys(pass);
		InpatientWardTab.click();
		loginButton.click();

		return new OpenMRSRegisterPage();

	}

}
