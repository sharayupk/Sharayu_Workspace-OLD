package TestNGFramework;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DPS2DataFetch 
{
	@DataProvider(name="login")
	public static Object[][] passData(Method method)
	{   
		String testcase=method.getName();
		if("loginpage".equals(testcase))
		{
			Object[][] data=new Object[2][2];

			data[0][0]="zareena.ali786@gmail.com";
			data[0][1]="zareena.ali786@gmail.com";
			
			data[1][0]="9960363529";
			data[1][1]="9960363529";
			
			return data;
		}
		return null;
		

	}
}
