package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseTest.MyStoreBase;

public class MyStoreRegisterPage extends MyStoreBase
{
  public MyStoreRegisterPage() throws IOException 
  {
	  PageFactory.initElements(driver,this);
  }
  
  @FindBy(linkText="Sign in")
  WebElement btnSignin;
  @FindBy(id="email_create")
  WebElement txtEmail;
  @FindBy(id="SubmitCreate")
  WebElement btnSubmit;
  @FindBy(id="id_gender2")
  WebElement btnRadio;
  @FindBy(id="customer_firstname")
  WebElement txtFirstname;
  @FindBy(id="customer_lastname")
  WebElement txtLastname;
  @FindBy(id="passwd")
  WebElement txtPassword;
  @FindBy(id="days")
  WebElement drpDay;
  @FindBy(id="months")
  WebElement drpMonth;
  @FindBy(id="years")
  WebElement drpYear;
  @FindBy(id="address1")
  WebElement txtAddress;
  @FindBy(id="city")
  WebElement txtCity;
  @FindBy(id="id_state")
  WebElement drpState;
  @FindBy(id="postcode")
  WebElement txtZipcode;
  @FindBy(id="id_country")
  WebElement drpCountry;
  @FindBy(id="phone_mobile")
  WebElement txtPhone;
  @FindBy(id="submitAccount")
  WebElement btnRegister;
  
  public void clickOnSigin()
  {
	  btnSignin.click();
  }
  public void enterEmail(String email)
  {
	  txtEmail.sendKeys(email);
  }
  public void clickOnSubmit()
  {
	  btnSubmit.click();
  }
  public void clickOnRadioBtn()
  {
	  btnRadio.click();
  }
  public void enterFirstname(String fn)
  {
	  txtFirstname.sendKeys(fn);
  }
  public void enterLastname(String ln)
  {
	  txtLastname.sendKeys(ln);
  }
  public void enterPassword(String pwd)
  {
	  txtPassword.sendKeys(pwd);
  }
  public void selectDay(String day)
  {
	  Select drp1=new Select(drpDay);
	  drp1.selectByValue(day);
  }
  public void selectMonth(String mon)
  {
	  Select drp2=new Select(drpMonth);
	  drp2.selectByValue(mon);
  }
  public void selectYear(String yr)
  {
	  Select drp3=new Select(drpYear);
	  drp3.selectByValue(yr);
  }
  public void enterAddress(String addr)
  {
	  txtAddress.sendKeys(addr);
  }
  public void enterCity(String city)
  {
	  txtCity.sendKeys(city);
  }
  public void selectState(String state)
  {
	  Select drp4=new Select(drpState);
	  drp4.selectByVisibleText(state);
  }
  public void enterZipcode(String zip)
  {
	  txtZipcode.sendKeys(zip);
  }
  public void selectCountry(String con)
  {
	  Select drp5=new Select(drpCountry);
	  drp5.selectByVisibleText(con);
  }
  public void enterPhone(String ph)
  {
	  txtPhone.sendKeys(ph);
  }
  public MyStoreSearchProdPage clickOnRegister() throws IOException
  {
	  btnRegister.click();
	  return new MyStoreSearchProdPage();
  }
  
  
  
  
  
  
  		
	
}
