package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class LoginPageTest extends Base {

	public WebDriver driver;

	@BeforeMethod
	public void openApplication() throws IOException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test(dataProvider = "getLoginData")
	public void login(String email, String password, String expectedResult) throws IOException, InterruptedException {

		LandingPage landingPage = new LandingPage(driver);
		landingPage.myAccountDropdown().click();
		landingPage.loginOption().click();

		Thread.sleep(3000);

		LoginPage loginPage = new LoginPage(driver);
		loginPage.emailAddressTextField().sendKeys(email);
		loginPage.passwordField().sendKeys(password);
		loginPage.loginButton().click();

		AccountPage accountPage = new AccountPage(driver);

		String acutualResult = null;

		try {

			if (accountPage.editYourAccountInformation().isDisplayed()) {
				acutualResult = "Success";
			}

		} catch (Exception e) {

			acutualResult = "Failure";
		}

		Assert.assertEquals(acutualResult, expectedResult);

	}

	@AfterMethod
	public void closure() {

		driver.close();

	}

	@DataProvider
	public Object[][] getLoginData() {

		Object[][] data = { { "arun.selenium@gmail.com", "Second@123", "Success" },
				{ "dummy@test.com", "1234", "Failure" } };

		return data;

	}
}