package Basics;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JenkinsTest1 {
	WebDriver driver = null;
	String url = "https://www.google.com/";
	public static Logger log;
	static String yourName;

	@AfterTest
	public void closeBrowsers() throws Exception {

		if (driver != null) {
			Thread.sleep(5000);
			driver.quit();
			Runtime.getRuntime().exec("TASKKILL /IM Chromedriver_V2.44.exe /FE");
			log.info("Browser closed successfully.!");
		}
	}

	@BeforeTest
	public void setUpBrowsers() {

		// Log4j Configurations
		log = Logger.getLogger("SeleniumA2Z");
		PropertyConfigurator.configure("Log4j.properties");

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		log.info("Browser launched successfully.!");
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

	@Test
	public static void Test() {
		yourName = "TestingName";
		System.out.println("Test" + yourName);
	}

	@Test
	public static void Test2() {
		System.out.println("Test2" + yourName);
	}

}
