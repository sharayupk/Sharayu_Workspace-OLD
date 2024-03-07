package HybridDrivenFramework;

import java.io.IOException;
public class DemoRegisterExecution
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{

        for(int i=1;i<=19;i++)
		{
            String key=DemoRegisterExcel.Keywords(i, 0);
            
            if(key.equals("openbrowser"))
            {
            	DemoRegisterAction.openbrowser();
            }
            else if(key.equals("navigate"))
            {
            	DemoRegisterAction.navigate();
            }
            else if(key.equals("enterfirstname"))
            {
            	DemoRegisterAction.enterfirstname();
            }
            else if(key.equals("enterlastname"))
            {
            	DemoRegisterAction.enterlastname();
            }
            else if(key.equals("enteraddr"))
            {
            	DemoRegisterAction.enteraddr();
            }
            else if(key.equals("enteremail"))
            {
            	DemoRegisterAction.enteremail();
            }
            else if(key.equals("enterphone"))
            {
            	DemoRegisterAction.enterphone();
            }
            else if(key.equals("selectgender"))
            {
            	DemoRegisterAction.selectgender();
            }
            else if(key.equals("selecthobby"))
            {
            	DemoRegisterAction.selecthobby();
            }
            else if(key.equals("selectlang"))
            {
            	DemoRegisterAction.selectlang();
            }
            else if(key.equals("selectskills"))
            {
            	DemoRegisterAction.selectskills();
            }
            else if(key.equals("selectcountry"))
            {
            	DemoRegisterAction.selectcountry();
            }
            else if(key.equals("selectcountrylist"))
            {
            	DemoRegisterAction.selectcountrylist();
            }
            else if(key.equals("selectyear"))
            {
            	DemoRegisterAction.selectyear();
            }
            else if(key.equals("selectmonth"))
            {
            	DemoRegisterAction.selectmonth();
            }
            else if(key.equals("selectday"))
            {
            	DemoRegisterAction.selectday();
            }
            else if(key.equals("enterpass"))
            {
            	DemoRegisterAction.enterpass();
            }
            else if(key.equals("enterconpass"))
            {
            	DemoRegisterAction.enterconpass();
            }
            else if(key.equals("clickonsubmit"))
            {
            	DemoRegisterAction.clickonsubmit();
            }
            
		}
	}
            	
}
