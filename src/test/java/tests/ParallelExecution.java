package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution {

	@Test
	public void test1() {
		
		 ChromeOptions chromeOptions = new ChromeOptions();
		    chromeOptions.addArguments("--remote-allow-origins=*");
		   
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.facebook.com/");
	}				
	
	@Test
	public void test2() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		driver.get("https://testenvironment.toptechschool.us/");
	}
	@Test
	public void test3() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://testenvironment.toptechschool.us/");
	}
}
