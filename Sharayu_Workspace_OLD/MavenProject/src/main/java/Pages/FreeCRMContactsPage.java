package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.FreeCRMBase;

public class FreeCRMContactsPage extends FreeCRMBase 
{
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr")
    List<WebElement> rows;
	
	public FreeCRMContactsPage() throws IOException 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void validateContactsWebTable()
	{
		int rowCount=rows.size();
		System.out.println("Total No. Of rows====>"+rowCount);
		
		for(int i=1;i<=rowCount;i++)
		{
			String name=driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(name);
			
			if(name.contains("manali a"))
			{
				
			}
		}
	}

}
