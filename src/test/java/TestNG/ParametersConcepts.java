package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersConcepts {

	WebDriver driver;

	@Test
	@Parameters({ "BrowserName" })
	public void launchBrowsers(String BrowserName) {

		try {
			if (BrowserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
				driver = new ChromeDriver();
				driver.get("https://www.google.com");
				driver.manage().window().maximize();
			} else {
				System.out.println("Browser Name is not matched");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
