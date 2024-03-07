package StepDefinition;

import java.io.IOException;


import Pages.OrangeHRMHomePage;
import Pages.OrangeHRMLoginPage;
import Pages.OrangeHRMUserPage;
import TestBase.FreeCRMBase;
import TestBase.OrangeHRMBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMHomePageTest extends OrangeHRMBase
{   
	OrangeHRMLoginPage loginpage;
	OrangeHRMHomePage homepage;
	OrangeHRMUserPage userpage;
	
public OrangeHRMHomePageTest() throws IOException 
{
    super();
}

@Given("^launch browser$")
public void launch_browser() throws IOException 
{
	OrangeHRMBase.Initialization();
	loginpage=new OrangeHRMLoginPage();
	homepage=new OrangeHRMHomePage();
	
}

@Then("^verify loginpage title$")
public void verify_loginpage_title() 
{
   String loginPageTitle=loginpage.verifyLoginPageTitle();
   System.out.println("Login Page Title--->"+loginPageTitle);
   junit.framework.Assert.assertEquals("OrangeHRM", loginPageTitle);
  
}

@Then("^\"([^\"]*)\" and \"([^\"]*)\"$")
public void username_and_password(String userid,String pass) throws IOException 
{
	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
}


@Then("^check admin text$")
public void check_admin_text()  
{
	//Get Text of Home Page
	String text=homepage.getAdminText();
	System.out.println("Home Page Text---->"+text);
	junit.framework.Assert.assertEquals("Welcome Admin", text);
			
}

@Then("^validate the url of home page$")
public void validate_the_url_of_home_page() 
{
	String homepageUrl=homepage.getURLOfHomePage();
	System.out.println("Url of Home Page---->"+homepageUrl);
	junit.framework.Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/dashboard", homepageUrl);
}

@Then("^mouse hover on admin and user mgmt link$")
public void mouse_hover_on_admin_and_user_mgmt_link() throws InterruptedException  
{
	Thread.sleep(1000);
	//Mouse Hover on Admin Link
	homepage.HoverOnAdminLink();
	
	Thread.sleep(1000);
	//Mouse Hover on user Mgmt Link
	homepage.HoverOnUserMgmtLink();
}

@Then("^click on user link and add button$")
public void click_on_user_link_and_add_button() throws InterruptedException, IOException 
{
	Thread.sleep(1000);
	//Click on Users Link
	homepage.clickOnUsersLink();
	
	Thread.sleep(1000);
	//Click On Add Button
	userpage=homepage.clickOnAddBtn();
}
}
