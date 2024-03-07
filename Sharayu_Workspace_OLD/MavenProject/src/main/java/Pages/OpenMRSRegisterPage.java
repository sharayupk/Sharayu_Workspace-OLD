package Pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseTest.OpenMRSBase;

public class OpenMRSRegisterPage extends OpenMRSBase
{
	@FindBy(xpath="//*[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")
	WebElement registerBtn;
    @FindBy(name="givenName")
	WebElement firstName;
    @FindBy(name="middleName")
	WebElement middleName;
    @FindBy(name="familyName")
	WebElement lastName;
	@FindBy(id="genderLabel")
	WebElement genderTab;
	@FindBy(id="gender-field")
	WebElement gender;
	@FindBy(xpath="//*[@id='formBreadcrumb']/li[1]/ul/li[3]")
	WebElement birthdateTab;
	@FindBy(name="birthdateDay")
	WebElement dayTxt;
	@FindBy(id="birthdateMonth-field")
	WebElement selectMonth;
	@FindBy(name="birthdateYear")
	WebElement yearTxt;
	@FindBy(xpath="//*[@id='formBreadcrumb']/li[2]/ul/li[1]/span")
	WebElement addressTab;
	@FindBy(id="address1")
	WebElement address;
	@FindBy(xpath="//*[@id='formBreadcrumb']/li[2]/ul/li[2]/span")
	WebElement phoneTab;
	@FindBy(name="phoneNumber")
	WebElement phone;
	@FindBy(xpath="//*[@id='formBreadcrumb']/li[3]/ul/li/span")
	WebElement relationTab;
	@FindBy(name="relationship_type")
	WebElement relation;
	@FindBy(xpath="//input[@ng-model='relationship.name']")
	WebElement relationTxt;
	@FindBy(id="confirmation_label")
	WebElement confirmTab;
	@FindBy(id="submit")
	WebElement confirmBtn;
	@FindBy(xpath="//*[@id='breadcrumbs']/li[1]/a/i")
	WebElement homeBtn;
	
    public OpenMRSRegisterPage() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}
    
    public void clickOnRegisterBtn()
    {
    	registerBtn.click();
    }
    public void enterName(String fname,String mname,String lname)
    {
    	firstName.sendKeys(fname);
    	middleName.sendKeys(mname);
    	lastName.sendKeys(lname);
    }
    public void selectGender()
    {
    	genderTab.click();
    	gender.click();
    }
    public void selectBirthDate(String day,String month,String year)
    {
    	birthdateTab.click();
    	dayTxt.sendKeys(day);
    	Select monthdrp=new Select(selectMonth);
    	monthdrp.selectByVisibleText(month);
    	yearTxt.sendKeys(year);
    }
    public void enterAddress()
    {
    	addressTab.click();
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("document.getElementById('address1').value='Pune';");
    }
    public void enterPhone(String ph)
    {
    	phoneTab.click();
    	phone.sendKeys(ph);
    }
    public void selectRelation(String reldrp,String reltxt)
    {
    	relationTab.click();
    	Select rel=new Select(relation);
    	rel.selectByVisibleText(reldrp);
    	relationTxt.sendKeys(reltxt);
    }
    public void clickOnConfirm() 
    {
    	confirmTab.click();
    	confirmBtn.click();
    }
    public OpenMRSFindPatientPage clickOnHomeBtn() throws IOException
    {
    	homeBtn.click();
    	return new OpenMRSFindPatientPage();
    }

}
