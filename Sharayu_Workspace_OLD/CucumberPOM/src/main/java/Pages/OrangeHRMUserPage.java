package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.OrangeHRMBase;

public class OrangeHRMUserPage extends OrangeHRMBase
{    
	@FindBy(id="systemUser_userType")
    WebElement userRole;
    
    @FindBy(id="systemUser_employeeName_empName")
    WebElement emp;
    
    @FindBy(xpath="//*[@id='frmSystemUser']/fieldset/ol//li")
    private List<WebElement> empName;
    
    @FindBy(id="systemUser_userName")
    WebElement userId;
    
    @FindBy(id="systemUser_status")
    WebElement status;
    
    @FindBy(id="btnSave")
    WebElement saveBtn;
    
    public OrangeHRMUserPage() throws IOException 
	{
        PageFactory.initElements(driver, this);
	}
    
    public void selectUserRole(String role)
    {
    	Select userroledrp=new Select(userRole);
    	userroledrp.selectByVisibleText(role);
    }
    
    public void setEmpName(String empname) throws InterruptedException
    {   
    	emp.sendKeys(empname);
    	emp.sendKeys(Keys.ENTER);
    	Thread.sleep(1000);
    }
    
    public void setUserid(String un)
    {
    	userId.sendKeys(un);
    }

    public void selectStatus(String st)
    {
    	Select statusdrp=new Select(status);
    	statusdrp.selectByVisibleText(st);
    }
    
    public void clickOnSaveBtn()
    {
    	saveBtn.click();
    }

    

}
