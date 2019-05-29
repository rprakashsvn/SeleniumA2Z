package Basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformSeriesOfActions {
	static WebDriver driver = null;

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");

		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		Actions act = new Actions(driver);
		// Below line sends some text to field by converting it to uppercase, then
		// double click the text so that it will select all, then do right click

		act.moveToElement(element).click().keyDown(element, Keys.SHIFT).sendKeys("Pandian").keyUp(element, Keys.SHIFT)
				.doubleClick(element).build().perform();

		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);

	}
}
