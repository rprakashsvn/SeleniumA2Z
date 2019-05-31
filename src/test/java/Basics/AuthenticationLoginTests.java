package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AuthenticationLoginTests {

	static WebDriver driver;
	static String authenticationURL = "http://admin:admin@the-internet.herokuapp.com/basic_auth";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver();
		driver.get(authenticationURL);
		driver.manage().window().maximize();

		String getName = driver.findElement(By.xpath("//*[@id='content']/div/p")).getText();
		System.out.println(getName);

		Assert.assertEquals(getName, "Congratulations! You must have the proper credentials");
		System.out.println("Test Case Passed.!");
	}
}
