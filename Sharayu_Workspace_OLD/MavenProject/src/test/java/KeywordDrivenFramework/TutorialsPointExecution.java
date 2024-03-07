package KeywordDrivenFramework;

import java.io.IOException;

import org.testng.annotations.Test;

public class TutorialsPointExecution 
{
	@Test
	public void execute() throws IOException, InterruptedException
	{   
		for(int i=1;i<=15;i++)
		{
			String key=TutorialsPointExcel.keyword(i,0);
			
			if(key.equals("openbrowser"))
			{
				 TutorialsPointAction.openbrowser();
			}
			else if(key.equals("navigate"))
			{
				TutorialsPointAction.navigate();
			}
			else if(key.equals("enterfirstname"))
			{
				TutorialsPointAction.enterfirstname();
			}
			else if(key.equals("enterlastname"))
			{
				TutorialsPointAction.enterlastname();
			}
			else if(key.equals("selectgender"))
			{
				TutorialsPointAction.selectgender();
			}
			else if(key.equals("selectexp"))
			{
				TutorialsPointAction.selectexp();
			}
			else if(key.equals("enterdate"))
			{
				TutorialsPointAction.enterdate();
			}
			else if(key.equals("selectprof"))
			{
				TutorialsPointAction.selectprof();
			}
			else if(key.equals("selectfile"))
			{
				TutorialsPointAction.selectfile();
			}
			else if(key.equals("selectflavours"))
			{
				TutorialsPointAction.selectflavours();
			}
			else if(key.equals("selectcont"))
			{
				TutorialsPointAction.selectcont();
			}
			else if(key.equals("selectcmd"))
			{
				TutorialsPointAction.selectcmd();
			}
			else if(key.equals("clickbutton"))
			{
				TutorialsPointAction.clickbutton();
			}
			else if(key.equals("clickalertok"))
			{
				TutorialsPointAction.clickalertok();
			}
			else if(key.equals("handlewindow"))
			{
				TutorialsPointAction.handlewindow();
			}
			
		}
	}
}
