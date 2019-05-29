package DataDrivenTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends SuperClass {

	// Locating Login button
	@FindBy(xpath = "(//button[@type='button'])[1]")
	private WebElement CookiePolicy;

	// Locating Login button
	@FindBy(id = "UserName")
	private WebElement UserName;

	// Locating Email id Text box
	@FindBy(id = "Password")
	private WebElement Password;

	// Locating Login button
	@FindBy(id = "loginButton")
	private WebElement loginButton;

	// Initializing the Objects
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Clicking on Login button
	public void acceptCookiePolicy() {
		CookiePolicy.click();
	}

	// Clicking on Login button
	public void enterUserName(String username) {
		UserName.sendKeys(username);
	}

	// Clicking on Login button
	public void enterPassword(String password) {
		UserName.sendKeys(password);
	}

	// Clicking on Login button
	public void clickLoginBtn() {
		loginButton.click();
	}

	// Specifiying email and psswd
	public void Login(String UN, String PWD) {
		CookiePolicy.click();
		UserName.sendKeys(UN);
		Password.sendKeys(PWD);
	}
}
