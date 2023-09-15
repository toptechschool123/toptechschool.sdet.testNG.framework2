package tests;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import core.BaseClass;

public class Parameterization extends BaseClass {

	@BeforeTest
	public void beforeTest() {
		
		BaseClass.initializeDriver();
		
	}

	
	
	
	@Parameters({ "browser","username", "password" })
	@Test
	public void testCaseTwo(String browser , String username, String password) {
		System.out.println("Parameter for browser is : " + browser);
		System.out.println("Parameter for User Name passed as : " + username);
		System.out.println("Parameter for Password passed as :" + password);
	}
}
