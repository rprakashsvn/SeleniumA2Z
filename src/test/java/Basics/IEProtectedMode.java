package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEProtectedMode {

	static WebDriver driver = null;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "./Drivers\\IEDriverServer_V3.14.0.exe");
		DesiredCapabilities cab = DesiredCapabilities.internetExplorer();
		cab.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		cab.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		driver = new InternetExplorerDriver(cab);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.quit();
	}
}
