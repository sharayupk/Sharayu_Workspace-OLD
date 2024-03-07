package TestNGFramework;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample 
{  
   @Parameters({"MyName"})
   @Test
   public void test1(@Optional("Selenium") String name)
   {
	   System.out.println("Name is :"+name);
   }
   }
