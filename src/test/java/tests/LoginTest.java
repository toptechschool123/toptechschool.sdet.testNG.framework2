package tests;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import core.BaseClass;
import pageObjects.LoginPageObjects;



@Listeners(utils.Listeners.class)
public class LoginTest extends BaseClass {
	LoginPageObjects loginObj;

	@BeforeTest
	public void user_is_on_test_environment_page() {
		BaseClass.initializeDriver();
		logger.info("before this is running");
	}

	@Test
	public void loginTestPage() {
		loginObj = new LoginPageObjects();

		loginObj.clickMyAccount();
		logger.info("clicking myAccount");
		
		loginObj.clickLogin();
		logger.info("clicking login");
		
		loginObj.enterEmail(getUserName());
		logger.info("entering email");
		
		loginObj.enterPassword(getPassword());
		logger.info("entering passwor");
		
		loginObj.clickLoginBttn();
		logger.info("clicking login");
	

	}
	
	@Test
	public void assertionFalse() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void assertionTrue() {
		Assert.assertTrue(true);
	}
	
	@Test
	public static void skipException() {
		
		throw new SkipException("skip exceptions");
	}
	
	
	@Test
	public void exceptionFail() {
		System.out.println(1/0);
	}

	@AfterTest
	public void gracefulTearDown() {
		logger.info("after test is running");
		BaseClass.tearDown();

	}

}
