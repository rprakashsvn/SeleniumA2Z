package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickInSelenium {
	
	static WebDriver driver = null;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://automationtalks.com/");

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id='mbtnav']/li[3]/a"))).build().perform();
		act.contextClick(driver.findElement(By.xpath("//*[@id='mbtnav']/li[3]/ul/li[2]/a"))).sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER).build().perform();
		// Switching between tabs using CTRL + tab keys.
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		// Switch to current selected tab's content.
		driver.switchTo().defaultContent();
	}

}