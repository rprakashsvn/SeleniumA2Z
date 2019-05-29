package GridConcepts;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGridsTests {

	static WebDriver driver;

	String appUrl = "http://www.google.com";
	String hubURL = "http://10.240.4.90:4444/grid/register/";
	String nodeURL = "http://10.240.4.90:4444/wd/hub";
	DesiredCapabilities dr = null;

	@Parameters({ "Browser" })
	@Test
	public void mailTest(String Browser) throws Exception {

		if (Browser.equalsIgnoreCase("Chrome")) {
			dr = DesiredCapabilities.chrome();
			dr.setBrowserName("chrome");
			dr.setPlatform(Platform.WINDOWS);
		} else if (Browser.equalsIgnoreCase("firefox")) {
			dr = DesiredCapabilities.firefox();
			dr.setBrowserName("firefox");
			dr.setPlatform(Platform.WINDOWS);
		} else {
			dr = DesiredCapabilities.internetExplorer();
			dr.setBrowserName("internet explorer");
			dr.setPlatform(Platform.WINDOWS);
			dr.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, false);
			dr.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, false);
		}

		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://10.240.4.90:4444/wd/hub"), dr);
		driver.manage().window().maximize();
		driver.get(appUrl);
		System.out.println("Title Is - " + driver.getTitle());
		// driver.quit();
	}
}
