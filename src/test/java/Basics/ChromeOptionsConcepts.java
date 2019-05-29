package Basics;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class ChromeOptionsConcepts {

	static WebDriver driver = null;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		ChromeOptions option = new ChromeOptions();
		option.setCapability(CapabilityType.BROWSER_NAME, "CHROME");
		option.setCapability(CapabilityType.PLATFORM, Platform.WIN10);
		option.addArguments("--disable-extensions");
		driver = new ChromeDriver(option);
		driver.get("http://www.inviul.com/");
		driver.manage().window().maximize();
		System.out.println("Platform is- " + option.getPlatform());
		System.out.println(driver.getTitle());
	}
}
