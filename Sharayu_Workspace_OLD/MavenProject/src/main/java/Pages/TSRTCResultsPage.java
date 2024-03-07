package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.TSRTCBase;

public class TSRTCResultsPage extends TSRTCBase
{
    @FindBy(xpath="//div[@class='col3-left']/span")
    List<WebElement> busNames;
    
    @FindBy(xpath="//div[@class='srvceNO']")
    List<WebElement> busNo;
    
	public TSRTCResultsPage() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void displayBuses() 
	{
		for(WebElement ele:busNames)
		{
			String text=ele.getText();
			System.out.println("Names of Buses--->"+text);
		}
	}
	
	public boolean getServices(String busNum)
	{   
		boolean flag=false;
		for(WebElement ele:busNo)
		{
			String text=ele.getText();
			System.out.println("Num of Buses--->"+text);
			
			if(text.equals(busNum))
			{
				flag=true;
				break;
			}
		}
		return flag;
	}

}
