package Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandles {

	static WebDriver driver = null;

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();

		Dimension dia = new Dimension(100, 300);
		driver.manage().window().setSize(dia);

		WebElement ele = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		jse.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();

		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Test");
	}
}
