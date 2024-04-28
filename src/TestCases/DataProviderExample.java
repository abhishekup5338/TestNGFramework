package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	//INVOCATION COUNT = The number of times this method should be invoked.
	//In testng.xml We can add xml file and add the group which we can want to run in test.
	
	@Test (dataProvider = "logindata")
	public void logintest(String userid, String pwd)
	{
		System.out.println("userid="+userid+"and password"+pwd);
	}
	
	@Test (dataProvider = "leaddata")
	public void leadtest(String lname, String company)
	{
		System.out.println("lname="+lname+"and company"+company);
	}
	
	
	@DataProvider
	public Object[][] logindata() {
		return new Object [][] {
			new Object[] {"test1", "pwd1"},
			new Object[] {"test2", "pwd2"},
			new Object[] {"test3", "pwd3"},
			new Object[] {"test4", "pwd4"},
			new Object[] {"test5", "pwd5"},
		};
	}
	
	
	@DataProvider
	public Object[][] leaddata() {
		return new Object [][] {
			new Object[] {"lname1", "comp1"},
			new Object[] {"lname2", "comp2"},
			new Object[] {"lname3", "comp3"},
		};
	}
	
	
	

}
