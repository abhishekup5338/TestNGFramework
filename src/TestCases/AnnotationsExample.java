package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsExample {
	
	
	
	//In Java Annotation means pre-defined rules just we have to use it. @ = ANNOTATION.
		//When we not want to run the case. simply "@Ignore" the case will not run.
	//1st one is grouping concept. It is not necessary that make group every time.
	//When we have to run the test for specific concept we can use grouping concept.
		
		
		
	 @Test(groups = { "Sprint2", "Sanity" }) 
		public void TestCase1()
		{
			System.out.println("TestCase1");
		}
		
		
		@Test
		public void TestCase2()
		{
			System.out.println("TestCase2");
		}
		
		
		@Test
		public void TestCase3()
		{
			System.out.println("TestCase3");
		}
		
		
		@BeforeMethod  //Pre-Condition
		public void login()
		{
			System.out.println("login");
		}

		
		@AfterMethod  //Post-Condition
		public void logout()
		{
			System.out.println("logout");
		}
	
	
		@BeforeClass //This not static
		public  void LauchApp()
		{
			System.out.println("LauchApp");
		}
		//It will run before the start of statement.
		
		
		@AfterClass //Not Static
		public  void CloseApp()
		{
			System.out.println("CloseApp");
		}
	
	
	
		@BeforeTest //It is run before the BeforeClass method.
		public void ReadData()
		{
			System.out.println("ReadData");
		}
		
		
		@AfterTest //It is run After the AfterClass method.
		public void CloseFile()
		{
			System.out.println("ReadData");
		}
	
		
		
		@BeforeSuite //The first who runs in code.
		public void Start()
		{
			System.out.println("Start Server");
		}
		
		@AfterSuite //The End one who runs in code.
		public void Stop()
		{
			System.out.println("Stop Server");
		}
	
	

}
