package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	public WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-firstname")
	WebElement txtFirstname;

	@FindBy(id = "input-lastname")
	WebElement txtLastname;

	@FindBy(id = "input-email")
	WebElement txtEmail;

	@FindBy(id = "input-telephone")
	WebElement txtTelephone;

	@FindBy(id = "input-password")
	WebElement txtPassword;

	@FindBy(id = "input-confirm")
	WebElement txtPasswordCon;

	@FindBy(name = "agree")
	WebElement policyChkBox;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement continueBtn;

	public WebElement txtFirstname() {
		return txtFirstname;
	}

	public WebElement txtLastname() {
		return txtLastname;
	}

	public WebElement txtEmail() {
		return txtEmail;
	}

	public WebElement txtTelephone() {
		return txtTelephone;
	}

	public WebElement txtPassword() {
		return txtPassword;
	}

	public WebElement txtPasswordCon() {
		return txtPasswordCon;
	}

	public WebElement policyChkBox() {
		return policyChkBox;
	}

	public WebElement continueBtn() {
		return continueBtn;
	}
}
