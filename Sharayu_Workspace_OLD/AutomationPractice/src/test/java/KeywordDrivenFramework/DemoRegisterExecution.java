package KeywordDrivenFramework;

import java.io.IOException;

import org.testng.annotations.Test;

public class DemoRegisterExecution {
	@Test
	public void execute() throws IOException, InterruptedException
	{
		for(int i=1;i<=19;i++)
		{
		String value=DemoRegisterExcel.getExcel(i,0);
		
		if(value.equals("openbrowser"))
		{
			DemoRegisterAction.openbrowser();
		}
		else if(value.equals("navigate"))
		{
			DemoRegisterAction.navigate();
		}
		else if(value.equals("enterfirstname"))
		{
			DemoRegisterAction.enterfirstname();
		}
		else if(value.equals("enterlastname"))
		{
			DemoRegisterAction.enterlastname();
		}
		else if(value.equals("enteraddr"))
		{
			DemoRegisterAction.enteraddr();
		}
		else if(value.equals("enteremail"))
		{
			DemoRegisterAction.enteremail();
		}
		else if(value.equals("enterphone"))
		{
			DemoRegisterAction.enterphone();
		}
		else if(value.equals("selectgender"))
		{
			DemoRegisterAction.selectgender();
		}
		else if(value.equals("selecthobby"))
		{
			DemoRegisterAction.selecthobby();
		}
		else if(value.equals("selectlang"))
		{
			DemoRegisterAction.selectlang();
		}
		else if(value.equals("selectskills"))
		{
			DemoRegisterAction.selectskills();
		}
		else if(value.equals("selectcountry")) 
		{
			DemoRegisterAction.selectcountry();
	    }
		else if(value.equals("selectcountrylist")) 
		{
			DemoRegisterAction.selectcountrylist();
	    }
		else if(value.equals("selectyear")) 
		{
			DemoRegisterAction.selectyear();
	    }
		else if(value.equals("selectmonth")) 
		{
			DemoRegisterAction.selectmonth();
	    }
		else if(value.equals("selectday")) 
		{
			DemoRegisterAction.selectday();
	    }
		else if(value.equals("enterpass")) 
		{
			DemoRegisterAction.enterpass();
	    }
		else if(value.equals("enterconpass")) 
		{
			DemoRegisterAction.enterconpass();
	    }
		else if(value.equals("clickonsubmit")) 
		{
			DemoRegisterAction.clickonsubmit();
	    }
		}

	}

}
