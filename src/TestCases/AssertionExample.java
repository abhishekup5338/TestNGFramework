package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {
	/*
	Types of Assert;-
	
	1) Soft Assert
    2) Hard Assert
	
	
	@Test //Hard Assert
	public void testcase5()
	{
		String ExpTitle = "vTigerCRM";
		String ActTitle = "vTigerCRM";
		
		assertEquals(ExpTitle, ActTitle);
		System.out.println("Execution Completed");
	}
	
	//If the execution is failed it jumps to another test case this is called hard assertion.
	//The Junit has only hard assert concept.
	//In TestNG we the both soft and hard asserts.
	
	*/

	@Test //Soft Assert
	public void testcase5()
	{ 
		SoftAssert sa = new SoftAssert();
		String ExpTitle = "vTigerCRM";
		String ActTitle = "vTigerCRM";
		
		//assertEquals(ExpTitle, ActTitle);
		sa.assertEquals(ExpTitle, ActTitle);
		System.out.println("Execution Completed");
		sa.assertAll();
	}
	
	//Soft assert will collect all failiers but did not stop the testing.
}
