package tests;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {

	public static WebDriver driver;

	SoftAssert softassert = new SoftAssert();
	SoftAssert softassert2 = new SoftAssert();

	@BeforeTest
	public  void beforeClass() {
		WebDriverManager.chromedriver().setup();

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--remote-allow-origins=*");

		 driver = new ChromeDriver(chromeOptions);
		driver.get("https://mvnrepository.com/");
	}

	
	@Test
	public void verifyTitle() {
		
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Maven Repository: Search/Browse/Explore";

		// Soft assert applied to verify title
		softassert.assertEquals(ActualTitle, ExpectedTitle);

		// If failed, this line gets printed and execution is not halted
		System.out.println("Assertion 1 is executed");

		softassert.assertAll();
	}
	
	@Test
	public void verifyElement(){
	WebElement searchIcon = driver.findElement(By.xpath("//input[@class='button']1"));
	softassert2.assertEquals (true, searchIcon.isDisplayed());
	softassert2.assertAll();
	
	
	//System.out.println("Icon is displayed");
	//System.out.println("Assertion 2 is executed");
	 
	}
	@Test
	public void verifytest() {
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Maven repo";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	     
	     
	@AfterTest
	public void closedriver(){
	driver.close();
	//Checks for failures if any and throws them at the end of execution 
	}
	     
	}
	
	
