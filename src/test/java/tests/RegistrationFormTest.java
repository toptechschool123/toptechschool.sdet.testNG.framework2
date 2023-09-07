package tests;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.BaseClass;
import pageObjects.RegistrationFormPageObjects;
import utils.ExcelUtility;

public class RegistrationFormTest extends BaseClass {
	
	RegistrationFormPageObjects object ;
	
	
	@BeforeTest
	public void initializeWebDriver() {
		
		BaseClass.initializeDriver();
		
	}
	
	@Test(dataProvider ="getTestData")
	public void registrationFormTest(String fName, String lName, String email, String phone, String pass, String confPass ) throws InterruptedException {
		
		 object = new RegistrationFormPageObjects();
		 object.clickOnMyAccount();
		  object.clickRegister();
		object.enterFirstName(fName);
		object.enterLastName(lName);
		object.enterEmail(email);
		object.enterTelephone(phone);
		object.selectCountry();
		object.enterPassword(confPass);
		object.enterConfPassword(confPass);
		object.clickSubscribe();
		object.clickPrivacyPolicy();
		object.clickContinueBttn();
		
	}
	
	@DataProvider()
	public Object[][] getTestData() {
		
		Object[][] data = ExcelUtility.getExcelData("info");
		return data;
	}
	
	@AfterTest
	public void close() {
		BaseClass.tearDown();
	}
	
}	

