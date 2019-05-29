package Basics;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecut {

	static WebDriver driver = null;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();

		// Get Domain Name
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String getDomainName = (String) js.executeScript("return document.domain");
		System.out.println("My Current URL Domain Name Is  : " + getDomainName);

		// Generate alert using JS
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("alert('Test Case Execution Is started Now..');");

		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert Text : " + alertText);

		driver.switchTo().alert().accept();

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("D:\\screenshot.jpg"));

		// To zoom In page 4 time using CTRL and + keys.
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.tagName("body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		}
		driver.quit();
	}

}
