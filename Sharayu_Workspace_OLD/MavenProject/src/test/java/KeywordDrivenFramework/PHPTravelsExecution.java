package KeywordDrivenFramework;

import java.io.IOException;

import org.testng.annotations.Test;

public class PHPTravelsExecution 
{
  
	@Test
	public void execute() throws IOException, InterruptedException
	{
		for(int i=1;i<=16;i++)
		{
			String key=PHPTravelsExcel.getdata(i, 0);
			
			if(key.equals("openbrowser"))
			{
				PHPTravelsAction.openbrowser();
			}
			
			if(key.equals("navigate"))
			{
				PHPTravelsAction.navigate();
			}
			
			if(key.equals("enterfirstname"))
			{
				PHPTravelsAction.enterfirstname();
			}
			
			if(key.equals("enterlastname"))
			{
				PHPTravelsAction.enterlastname();
			}
			
			if(key.equals("enteremail"))
			{
				PHPTravelsAction.enteremail();
			}
			
			if(key.equals("selectphone"))
			{
				PHPTravelsAction.selectphone();
			}
			
			if(key.equals("enterphone"))
			{
				PHPTravelsAction.enterphone();
			}
			
			if(key.equals("enterstreet"))
			{
				PHPTravelsAction.enterstreet();
			}
			
			if(key.equals("entercity"))
			{
				PHPTravelsAction.entercity();
			}
			
			if(key.equals("enterstate"))
			{
				PHPTravelsAction.enterstate();
			}
			
			if(key.equals("enterpincode"))
			{
				PHPTravelsAction.enterpincode();
			}
			
			if(key.equals("selectcountry"))
			{
				PHPTravelsAction.selectcountry();
			}
			
			if(key.equals("selectfindus"))
			{
				PHPTravelsAction.selectfindus();
			}
			
			if(key.equals("entermobile"))
			{
				PHPTravelsAction.entermobile();
			}
			
			if(key.equals("clickgeneratepassword"))
			{
				PHPTravelsAction.clickgeneratepassword();
			}

			if(key.equals("enterpasswordlen"))
			{
				PHPTravelsAction.enterpasswordlen();
			}
			
		}
	}
}
