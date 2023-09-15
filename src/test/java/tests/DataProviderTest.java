package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import tests_1.DataProviderTestPageObjects;





public class DataProviderTest extends BaseClass {
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
	public void loginToWebPage(String user, String pass) {
	//	System.out.println(username + "*****" + password);
		
	
	}

	@DataProvider(name = "data")
	public Object dataSet() {
		Object[][] data = new Object[2][2];  

		// first row
		data[0][0] = "standard_user";
		data[1][0] = "secret_sauce";

		// second row
		data[1][0] = "standard_user";
		data[1][1] = "secret_sauce";
		// third row
		
		return data;

	}
		
	
	@AfterTest
		public void tearDwon(){
			driver.close();
			System.out.println("closing the driver");
	}
}
