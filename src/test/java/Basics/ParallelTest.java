package Basics;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {

	WebDriver driver = null;
	String url = "https://www.google.com/";
	public static Logger log;
	String Browsers = "Chrome";

	@AfterTest
	public void closeBrowsers() throws Exception {

		if (driver != null) {
			Thread.sleep(2000);
			driver.quit();
			Runtime.getRuntime().exec("TASKKILL /IM Chromedriver_V2.44.exe /FE");
			log.info("Browser closed successfully.!");
		}
	}

	@Parameters("Browser")
	@BeforeTest
	public void setUpBrowsers(@Optional String Browser) {

		// Log4j Configurations
		log = Logger.getLogger("SeleniumA2Z");
		PropertyConfigurator.configure("Log4j.properties");

		if (Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers\\Geckodriver_V0.23.0.exe");
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "./Logs\\FirefoxLogs.txt");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver", "./Drivers\\IEDriverServer_V3.14.0.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(url);
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
