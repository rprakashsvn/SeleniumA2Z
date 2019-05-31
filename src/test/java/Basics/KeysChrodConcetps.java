package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysChrodConcetps {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.manage().window().maximize();

		WebElement txtFName = driver.findElement(By.name("FirstName"));
		WebElement txtLName = driver.findElement(By.name("LastName"));
		txtFName.sendKeys("webdriver");
		Actions a = new Actions(driver);
		a.sendKeys(txtFName, Keys.chord(Keys.CONTROL, "a")).perform();
		a.sendKeys(Keys.chord(Keys.CONTROL, "c")).perform();
		a.sendKeys(txtLName, Keys.chord(Keys.CONTROL, "v")).perform();
		Thread.sleep(2000);
	}
}
