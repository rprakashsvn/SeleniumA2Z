package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowserDemo {

	public static void main(String[] args) {

		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		System.out.println("Title of the page is- " + driver.getTitle());
		driver.quit();
	}
}