package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.BaseClass;

public class RegistrationFormPageObjects extends BaseClass {

	public RegistrationFormPageObjects() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//li[@class='dropdown']/child::a/span[1]")
	private WebElement myAccount;

	@FindBy(how = How.CSS, using = "#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a")
	private WebElement clickRegister; 

	@FindBy(id = "input-firstname")
	private WebElement firstName;

	@FindBy(id = "input-lastname")
	private WebElement lastName;

	@FindBy(id = "input-email")
	private WebElement enterEmail;

	@FindBy(id = "input-telephone")
	private WebElement enterTelephone;

	@FindBy(name = "country")
	private WebElement country;

	@FindBy(id = "input-password")
	private WebElement enterPassword;

	@FindBy(id = "input-confirm")
	private WebElement enterConfPassword;

	@FindBy(how = How.XPATH, using = "//input[@name='newsletter' and@value='1']")
	private WebElement subscribe;

	@FindBy(how = How.XPATH, using = "//input[@name='agree']")
	private WebElement clickPrivacyCheckBox;

	@FindBy(id = "signupbtn")
	private WebElement continueBttn;

	@FindBy(how = How.XPATH, using = "//div[@class='row']/child::div[@id='content']/h1[text()='Your Account Has Been Created!']")
	private WebElement textMessage;

	public void clickOnMyAccount() throws InterruptedException {

		myAccount.click();
		Thread.sleep(3000);
	}

	public void clickRegister() throws InterruptedException {

		clickRegister.click();

	}

	public void enterFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}

	public void enterLastName(String lastname) {
		lastName.sendKeys(lastname);
	}

	public void enterEmail(String email) {
		enterEmail.sendKeys(email);
	}

	public void enterTelephone(String phone) {
		enterTelephone.sendKeys(phone);
	}

	public void selectCountry() {
		country.click();
		Select s = new Select(country);
		s.selectByValue("Albania");
	}

	public void enterPassword(String pass) {
		enterPassword.sendKeys(pass);
	}

	public void enterConfPassword(String Confpass) {
		enterConfPassword.sendKeys(Confpass);
	}

	public void clickSubscribe() {
		subscribe.click();
		
		
	}

	public void clickPrivacyPolicy() {
		clickPrivacyCheckBox.click();
	}

	public void clickContinueBttn() {
		continueBttn.click();
	}

	public String accountCreated() throws InterruptedException {

		Thread.sleep(5000);
		// String atualMsge =DriverUtility.getText(textMessage);
		String atualMsge = textMessage.getText();
		return atualMsge;
	}
}
