package KeywordDrivenFramework;

import java.io.IOException;

import org.testng.annotations.Test;

public class PTEPracticeExecute 
{
	@Test
	public void execute() throws IOException, InterruptedException
	{    
		for(int i=1;i<=17;i++)
		{
			String key=PTEPracticeExcel.getExcel(i, 0);

			if(key.equals("openbrowser"))
			{
				PTEPracticeAction.openbrowser();
			}
			if(key.equals("navigate"))
			{
				PTEPracticeAction.navigate();
			}
			if(key.equals("enterfirstname"))
			{
				PTEPracticeAction.enterfirstname();
			}
			if(key.equals("enterlastname"))
			{
				PTEPracticeAction.enterlastname();
			}
			if(key.equals("enteremail"))
			{
				PTEPracticeAction.enteremail();
			}
			if(key.equals("enterconemail"))
			{
				PTEPracticeAction.enterconemail();          
			}
			if(key.equals("enterpassword"))
			{
				PTEPracticeAction.enterpassword();
			}

			if(key.equals("enterconpassword"))
			{
				PTEPracticeAction.enterconpassword();
			}

			if(key.equals("enteraddr"))
			{
				PTEPracticeAction.enteraddr();
			}

			if(key.equals("entercity"))
			{
				PTEPracticeAction.entercity();           
			}

			if(key.equals("selectcountry"))
			{
				PTEPracticeAction.selectcountry();
			}
			if(key.equals("selectday"))
			{
				PTEPracticeAction.selectday();
			}
			if(key.equals("selectmonth"))
			{
				PTEPracticeAction.selectmonth();
			}
			if(key.equals("selectyear"))
			{
				PTEPracticeAction.selectyear();
			}
			if(key.equals("selectdegree"))
			{
				PTEPracticeAction.selectdegree();      
			}
			if(key.equals("clickonterms"))
			{
				PTEPracticeAction.clickonterms();
			}
			if(key.equals("clickoncaptcha"))
			{
				PTEPracticeAction.clickoncaptcha();
			}

		}
	}
}
