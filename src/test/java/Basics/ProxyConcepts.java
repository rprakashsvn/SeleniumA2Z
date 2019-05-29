package Basics;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class ProxyConcepts {

	static WebDriver driver = null;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("localhost:5555");
		options.setCapability(CapabilityType.PROXY, proxy);
		driver = new ChromeDriver(options);
		driver.get("http://www.inviul.com/");
		driver.manage().window().maximize();
	}

}
