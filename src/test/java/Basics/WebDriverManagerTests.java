package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManagerTests {

	static WebDriver driver;

	public static void main(String args[]) {

		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
