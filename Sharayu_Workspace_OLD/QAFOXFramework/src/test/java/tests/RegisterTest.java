package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingRegPage;
import pageObjects.RegistrationPage;
import resources.Base;

public class RegisterTest extends Base {

	public WebDriver driver;

	@BeforeMethod
	public void openApplication() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test(dataProvider = "getRegisterData")
	public void registerTest(String fname, String lname, String email, String phone, String pwd, String conpwd)
			throws InterruptedException {
		LandingRegPage landingreg = new LandingRegPage(driver);
		landingreg.myAccountDropdown().click();
		Thread.sleep(4000);
		landingreg.registerOption().click();

		Thread.sleep(3000);
		RegistrationPage registerpage = new RegistrationPage(driver);
		registerpage.txtFirstname().sendKeys(fname);
		registerpage.txtLastname().sendKeys(lname);
		registerpage.txtEmail().sendKeys(email);
		registerpage.txtTelephone().sendKeys(phone);
		registerpage.txtPassword().sendKeys(pwd);
		registerpage.txtPasswordCon().sendKeys(conpwd);
		registerpage.policyChkBox().click();
		registerpage.continueBtn().click();

	}

	@DataProvider
	public Object[][] getRegisterData() {
		Object[][] data = { { "Shaan", "Kumar", "shaan@gmail.com", "8765987654", "Shaan@123", "Shaan@123" },
		{ "Jeevan", "Kumar", "jeevan@gmail.com", "6555984563", "Jeevan@123", "Jeevan@123" }};
		return data;
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
