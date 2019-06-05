/*package Basics;

import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridTests {

	public static Logger log;
	WebDriver driver = null;
	String googleURL = "https://www.google.com/";

	@AfterTest
	public void closeBrowsers() throws Exception {

		if (driver != null) {
			Thread.sleep(2000);
			driver.quit();
			Runtime.getRuntime().exec("TASKKILL /IM Chromedriver_V2.44.exe /FE");
			log.info("Browser closed successfully.!");
		}
	}

	@Test
	public void enterText() {

		driver.findElement(By.name("q")).sendKeys("Automation Testing");
		log.info("Text Entered");
		driver.findElement(By.xpath(("(//input[@type='submit'])[3]"))).click();
		log.info("Clicked Google Search Button");
		String title = driver.getTitle();
		if (title.contains("G")) {
			log.info("Title Matched, Test Case Passed");
		} else {
			log.info("Title is Not Matched, Test Case Failed");
		}
	}

	@SuppressWarnings("static-access")
	@BeforeMethod
	@Parameters("Browser")
	public void setUpBrowsers(String Browser) throws Exception {

		log = Logger.getLogger("SeleniumA2Z");
		PropertyConfigurator.configure("Log4j.properties");
		DesiredCapabilities cap = null;

		if (Browser.equalsIgnoreCase("chrome")) {
			cap = new DesiredCapabilities().chrome();
			cap.setCapability("browserName", Browser);
			cap.setPlatform(Platform.WIN10);
		} else if (Browser.equalsIgnoreCase("Firefox")) {
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "./Logs\\FirefoxLogs.txt");
			cap = new DesiredCapabilities().firefox();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WIN10);
		} else {
			cap = new DesiredCapabilities().internetExplorer();
			cap.setBrowserName("internet explorer");
			cap.setPlatform(Platform.WINDOWS);
		}

		URL myHubURL = new URL("http://10.240.4.90:4444/wd/hub");
		driver = new RemoteWebDriver(myHubURL, cap);
		driver.get(googleURL);
		driver.manage().window().maximize();
		log.info(Browser + " Browser launched successfully.!");
	}

	@Test
	public void verifyPageTitle() {

		String pageTitle = driver.getTitle();
		log.info("Verify Page Title Is : " + pageTitle);
		if (pageTitle.equalsIgnoreCase("Google")) {
			log.info("Title Matched, Test Case Passed");
		} else {
			log.info("Title is Not Matched, Test Case Failed");
		}
	}
}
*/