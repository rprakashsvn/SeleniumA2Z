package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AKillChromeDrivers {

	static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		Runtime.getRuntime().exec("TASKKILL /IM chromedriver.exe /F");
		Runtime.getRuntime().exec("TASKKILL /IM Chromedriver_V2.44.exe /F");
		Runtime.getRuntime().exec("TASKKILL /IM Geckodriver.exe /F");

		driver.quit();
	}

}
