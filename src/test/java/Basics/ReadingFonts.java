package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingFonts {

	static WebDriver driver = null;

	public static void main(String args[]) throws InterruptedException {

		// (Example : font-family, font-size, font-weight, text-align, color etc.)

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();

		WebElement fontValidations = driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/p"));

		// Get Font Family
		String fontFamily = fontValidations.getCssValue("font-family").toString();
		System.out.println(fontFamily);

		// Get Font size
		String fontSize = fontValidations.getCssValue("font-size").toString();
		System.out.println(fontSize);

		// Get Font weight
		String fontWeight = fontValidations.getCssValue("font-weight").toString();
		System.out.println(fontWeight);

		// Get Font Color
		String fontColor = fontValidations.getCssValue("color").toString();
		System.out.println(fontColor);

		// Get Font Text Align
		String fonttxtAlign = fontValidations.getCssValue("text-align").toString();
		System.out.println(fonttxtAlign);

		driver.quit();
	}
}
