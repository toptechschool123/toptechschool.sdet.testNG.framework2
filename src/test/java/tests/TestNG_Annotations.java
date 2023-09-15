package tests;


import org.junit.Ignore;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import core.BaseClass;
@Listeners(utils.Listeners.class)
public class TestNG_Annotations extends BaseClass {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("it is before suite");
	}

	@AfterSuite
	public void aftereSuite() {
		System.out.println("it is after suite method ");
	}
	
	@BeforeTest
	public void beforTest() {
		System.out.println("it is before test ");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("it is after test");
	}
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("it is before groups ");
	}
	@AfterGroups
	public void afterGroups() {
		System.out.println("it is after groups ");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("it is before class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("it is after class");
	}
	@BeforeMethod (enabled = false)
	public void beforeMethod() {
		System.out.println("it is before method");
	}
	
	@AfterMethod(enabled = false)
	public void afterMethod() {
		System.out.println("it is after method");
	}
	
	
	@Test
	public void smokeTest1() {
		System.out.println("it is smoke test");
	}
	@Test
	public void smokeTest2() {
		System.out.println("it is smoke test2");
	}
	
	@Test
	public void regressionTest1() {
		System.out.println("it is regresion test");
	}
	@Test
	public void regressionTest2() {
		System.out.println("it is regresion test 2");
		System.out.println(1/0);
	}

}
