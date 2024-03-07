package com.inetbanking.pageObjects;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "uid")
	WebElement userName;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(how = How.NAME, using = "btnLogin")
	WebElement loginBtn;
	
	@FindBy(how=How.LINK_TEXT,using="Log out")
	WebElement logoutBtn;

	public void setUserName(String uid) {
		userName.sendKeys(uid);
	}

	public void setPassword(String pass) {
		Password.sendKeys(pass);
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public void clickLogoutBtn() {
		logoutBtn.click();
	}


}
