package tests;

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
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import core.BaseClass;

public class TestNG_GroupingAndDependency {

	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("it is before suite method ******** launcing the browser******");
	}

	@BeforeTest
	public void beforTest() {
		System.out.println("it is before test ********** opening the webpage");
	}

	@BeforeGroups(enabled = false)
	public void beforeGroups() {
		System.out.println("it is before groups *****no groups specified yet");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("it is before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("it is before method");
	}

	@Test
	public void test() {
		System.out.println("it is test method");

	}

	@Test(invocationCount = 2)
	public void runTestMultipleTimes() {
		System.out.println("it is invocation count");
	}

	@Test(description = "it is not ready yet")
	public void description() {
		System.out.println("it is description feature");
	}

	@Test(alwaysRun = true)
	public void alwaysRun() {
		System.out.println("it is alwaysRun feature");
	}

	@Test(dependsOnMethods = { "alwaysRun" })
	public void dependsOnMethods() {
		System.out.println("it is method dependency");
	}
	
	@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("it is groups feature test1");
	}
	
	@Test(groups = {"smoke"})
	public void test2() {
		System.out.println("it is group feature test2");
	}
	@Ignore
	@Test(groups = {"regression"})
	public void test3() {
		System.out.println("it is group feature test3");
	}
	
	@Test(groups = {"regression"})
	public void test4() {
		System.out.println("it is group feature test4");
	}
	@Test(dependsOnGroups = {"regression"})
	public void test5() {
		System.out.println("it is depends on groups");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("it is after method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("it is after Class");
	}

	@AfterGroups
	public void afterGroups() {
		System.out.println("it is after group");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("it is after test");
	}

	@Ignore
	@AfterSuite
	public void afterSuite() {
		System.out.println("it is after suite");
	}

	@AfterTest
	public void gracefulTearDown() {
		System.out.println("it is after test ***tear down method");
		
	}

}
