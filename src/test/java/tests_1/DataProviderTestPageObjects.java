package tests_1;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import core.BaseClass;

public class DataProviderTestPageObjects extends BaseClass  {
	
	
	public DataProviderTestPageObjects() { 
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"user-name\"]" )
	private WebElement userName;

	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	private WebElement password;         
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"login-button\"]")
	private WebElement login;
	
	
	

	public void enterUserName(String username) {
		
		userName.sendKeys(username);
	}
	
	public void enterpasswor(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickLogin() {
		login.click();
	}
	
	
}


