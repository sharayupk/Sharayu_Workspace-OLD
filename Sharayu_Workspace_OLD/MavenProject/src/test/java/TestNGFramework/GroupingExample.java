package TestNGFramework;

import org.testng.annotations.Test;

@Test(groups= {"AllClassTests"})
public class GroupingExample 
{
   @Test(groups= {"smoke"})
   public void test1()
   {
	   System.out.println("I am in Test 1");
   }
   
   @Test(groups= {"sanity","regression"})
   public void test2()
   {
	   System.out.println("I am in Test 2");
   }
   
   @Test(groups= {"sanity"})
   public void test3()
   {
	   System.out.println("I am in Test 3");
   }
   
   @Test
   public void test4()
   {
	   System.out.println("I am in Test 4");
   }
}
