package TestCases;

import org.testng.annotations.Test;

public class TestMethodsExample {
	
	//In dependencies the one case depends on other case.
	//there are two types of dependencies "HARD DEPENDENCIES" or "SOFT DEPENDENCIES".
	//Example - We cannot login the app without launchApp. 
    //If we want to run the test at any cost than simply use "ALWAYS TRUE" method on that test case.
	//"INVCATION COUNT" - The number of times this method should be invoked.
    //We can decide that how many times the login or etc will run in test case.
	//"PRIORITY" we can priorities what we want to run first.
	   
			
			
			@Test(dependsOnMethods = { "testcase5" })
			public void calc()
			{
				System.out.println("calc");
			}
			 
			@Test
			public void testcase5()
			{
				System.out.println("testcase5");
			}

			
			//EXAMPLE 2
			
			@Test(dependsOnMethods = { "LaunchApp" })
			public void login()
			{
				System.out.println("login");
			}
			 
			@Test
			public void LaunchApp()
			{
				System.out.println("LaunchApp");
			}

}
