package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class htmlUnitDriverTesting {

	public static void main(String[] args) {

		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.com");
		String Title = driver.getTitle();
		System.out.println("I am at " + Title);
	}
}