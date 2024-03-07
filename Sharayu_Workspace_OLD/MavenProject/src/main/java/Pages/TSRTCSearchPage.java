package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.TSRTCBase;

public class TSRTCSearchPage extends TSRTCBase{
    
	@FindBy(id="fromPlaceName")
	WebElement fromPlace;
	
	@FindBy(id="toPlaceName")
	WebElement toPlace;
	
	@FindBy(xpath="//ul[@id='ui-id-1']//li")
	List<WebElement> fromPlaceList;
	
	@FindBy(xpath="//ul[@id='ui-id-2']//li")
	List<WebElement> toPlaceList;
	
	@FindBy(id="txtJourneyDate")
	WebElement departs;
	
	@FindBy(xpath="//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[5]/a")
	WebElement day;
	
	@FindBy(id="searchBtn")
	WebElement searchBtn;
	
	public TSRTCSearchPage() throws IOException 
	{
        PageFactory.initElements(driver, this);
    }
	
	public void verifyFromLocation(String frmLocation,String actFromLocation)
	{   
		fromPlace.sendKeys(frmLocation);
		for(WebElement ele:fromPlaceList)
		{
			String text=ele.getText();
			System.out.println("From Location List--->"+text);
			
			if(text.equals(actFromLocation))
			{
				ele.click();
				break;
			}
		}
	}
	
	public void verifyToLocation(String toLocation,String actToLocation)
	{   
		toPlace.sendKeys(toLocation);
		for(WebElement ele:toPlaceList)
		{
			String text=ele.getText();
			System.out.println("To Location List--->"+text);
			
			if(text.equals(actToLocation))
			{
				ele.click();
				break;
			}
		}
	}
	
	public void clickOnDate()
	{
		departs.click();
		
		day.click();
	}
	
	public TSRTCResultsPage clickOnSearchBtn() throws IOException
	{
		searchBtn.click();
		
		return new TSRTCResultsPage();
	}
	
	
	

}
