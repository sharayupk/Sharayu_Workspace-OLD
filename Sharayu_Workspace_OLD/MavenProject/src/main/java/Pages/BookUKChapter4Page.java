package Pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BookUKBase;

public class BookUKChapter4Page extends BookUKBase
{
	@FindBy(id="dateInput")
	WebElement inputText;

	@FindBy(id="blurry")
	WebElement alertInput;

	@FindBy(id="selectLoad")
	WebElement loadBtn;
	
	@FindBy(id="hoverOver")
	WebElement mouseHover;

	public BookUKChapter4Page() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterText(String text)
	{
		inputText.sendKeys(text);
	}
	
	public void enterTextInAlertInput(String txt)
	{
		alertInput.sendKeys(txt);
	}
	
	public void clickOnLoadBtn() throws InterruptedException
	{
		loadBtn.click();
		
		Alert alert=driver.switchTo().alert();
		String alText=alert.getText();
		System.out.println("Alert Text---->"+alText);
		Thread.sleep(2000);
		
		alert.accept();
	}
	
	public void verifyMouseHover() throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(mouseHover).build().perform();
		
		Alert alert=driver.switchTo().alert();
		String alText=alert.getText();
		System.out.println("Alert Text---->"+alText);
		Thread.sleep(2000);
		
		alert.accept();
	}



}
