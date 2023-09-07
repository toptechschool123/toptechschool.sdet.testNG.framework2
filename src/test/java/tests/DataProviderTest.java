package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {

	public static WebDriver driver;

	@BeforeTest
	public void webdriverInitializer() {
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--start-maximized");
			chromeOptions.addArguments("--remote-allow-origins=*");

			 driver = new ChromeDriver(chromeOptions);
			 driver.get("https://www.saucedemo.com/");
	}
	@Test(dataProvider = "data")
	public void loginToWebPage(String username, String password) {
	//	System.out.println(username + "*****" + password);

	}

	@DataProvider(name = "data")
	public Object dataSet() {
		Object[][] data = new Object[4][2];  

		// first row
		data[0][0] = "user1";
		data[1][0] = "pass1";

		// second row
		data[1][0] = "user2";
		data[1][1] = "pass2";
		// third row
		data[2][0] = "user3";
		data[2][1] = "pass3";

		// fourth row
		data[3][0] = "user4";
		data[3][1] = "pass4";

		return data;

	}


	@Test(dataProvider = "create")
	public void test1(String username, String password, String test) {

		//System.out.println(username + "***" + password + "***" + test);
	}

 
	@DataProvider(name = "create")
	public Object dataSet1() {

		return new Object[][] { 
			{ "username", "password", "test" },
			{ "username1", "password1", "test1" },
			{ "username2", "password2", "test2" },
		    { "username3", "password3", "test3" },

		};
	}

		
	
	@AfterTest
		public void tearDwon(){
			driver.close();
			System.out.println("closing the driver");
	}
}
