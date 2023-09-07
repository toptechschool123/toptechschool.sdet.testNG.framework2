package tests;

import org.testng.SkipException;
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

public class TestNG_Features {
	@BeforeTest(alwaysRun = true)
	public void user_is_on_test_environment_page() {

		System.out.println("******** alwaysRun******");
	}

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

	@Test(invocationCount = 2, priority = -1)
	public void runTestMultipleTimes() {
		System.out.println("it is invocation count");
	}

	@Test(description = "it is not ready yet", priority = 0)
	public void description() {
		System.out.println("it is description feature");
	}

	@Test(alwaysRun = true, priority = 1)
	public void alwaysRun() {
		System.out.println("it is alwaysRun feature");
	}

	@Test(priority = 2)
	public void smoke() {
		System.out.println("it is smoke");
	}

	@Test(priority = 3)
	public void integration() {
		System.out.println("it is integration");
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

	
	@Test(expectedExceptions=ArithmeticException.class)
	public void dividedByZeroExample1() {
		int e = 1 / 0;
	}
	@Test
	public void testCaseSkipException(){
			System.out.println("Im in skip exception");
			throw new SkipException("Skipping this exception");
		}
	@Test(timeOut=1000) // specify time in milliseconds
	public void executetimeOut() throws InterruptedException{

		
}
}