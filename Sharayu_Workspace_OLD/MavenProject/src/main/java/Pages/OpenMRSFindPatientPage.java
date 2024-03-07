package Pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.OpenMRSBase;

public class OpenMRSFindPatientPage extends OpenMRSBase
	{
		@FindBy(xpath="//*[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']/i")
		WebElement findPatientBtn;

		@FindBy(id="patient-search")
		WebElement searchBox;

		public OpenMRSFindPatientPage() throws IOException 
		{
			PageFactory.initElements(driver, this);
		}
		
		public void clickOnFindPatientBtn()
		{
			findPatientBtn.click();
		}
		
		public void SearchPatient(String patname)
		{
			searchBox.sendKeys(patname);
			searchBox.sendKeys(Keys.ENTER);
		}
}
