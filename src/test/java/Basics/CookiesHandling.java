package Basics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesHandling {

	static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();

		Cookie name = new Cookie("TestingCookies", "prakashpandian@Rajaram@RJP");
		driver.manage().addCookie(name);

		// Get all cookies and print them.
		Set<Cookie> totalCookies = driver.manage().getCookies();
		System.out.println("Total Number Of cookies : " + totalCookies.size());

		for (Cookie currentCookie : totalCookies) {
			System.out.println(String.format("%s -> %s -> %s", "Domain Name : " + currentCookie.getDomain(),
					"Cookie Name : " + currentCookie.getName(), "Cookie Value : " + currentCookie.getValue()));
		}

		driver.manage().deleteAllCookies();
		// Get all cookies and print them.
		Set<Cookie> newTotalCookies = driver.manage().getCookies();
		System.out.println("Total Number Of cookies : " + newTotalCookies.size());

	}
}
