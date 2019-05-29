package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class htmlDriver {

	WebDriver driver;
	String pagetitle;

	@BeforeTest
	public void setup() throws Exception {

		// To hide warnings logs from execution console.
		Logger logger = Logger.getLogger("htmlDriver.class");
		logger.setLevel(Level.OFF);

		// Initializing HtmlUnitDriver.
		// driver = new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Opening URL In HtmlUnitDriver.
		driver.get("http://www.google.com");
	}

	@AfterTest
	public void tearDown() throws Exception {
		// Closing HtmlUnitDriver.
		driver.quit();
	}

	@Test
	public void googleSearch() {

		// Get and print page title before search.
		pagetitle = driver.getTitle();
		System.out.println("Page title before search : " + pagetitle);

		// Search with Hello World on google.
		WebElement Searchbox = driver.findElement(By.xpath("//input[@name='q']"));
		Searchbox.sendKeys("Hello World");
		Searchbox.submit();

		// Get and print page title after search.
		pagetitle = driver.getTitle();
		System.out.println("Page title after search : " + pagetitle);

		// Get list of search result strings.
		List<WebElement> allSearchResults = driver.findElements(By.cssSelector("ol li h3>a"));

		// Iterate the above list to get all the search titles & links from that page.
		for (WebElement eachResult : allSearchResults) {
			System.out.println("Title : " + eachResult.getText() + ", Link : " + eachResult.getAttribute("href"));
		}
	}
}