package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.YoutubeBase;

public class YoutubeChannelPage extends YoutubeBase
{
	WebDriver driver;

	public YoutubeChannelPage(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public String getHomePageTitle()
	{
		return driver.getTitle();
	}
}
