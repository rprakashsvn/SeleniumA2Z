package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTABS {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver();
		driver.get("https://itrack.msc.net/secure/dologin.aspx");
	}
}
