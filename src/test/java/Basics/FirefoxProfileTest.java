package Basics;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirefoxProfileTest {

	static WebDriver driver = null;

	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		// FirefoxOptions pro = new FirefoxOptions();
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Explcit Waits
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());

		// Fulent Waits
		Wait<WebDriver> waits = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(10, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		driver.quit();
		System.out.println("Browser Closed");

		// Runtime.getRuntime().exec("TASKKILL /F /IM Chromedriver_V2.44.exe");
	}
}
