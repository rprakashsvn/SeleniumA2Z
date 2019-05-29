package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcepts {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		// Switching Frames
		WebElement switchFrames = driver.findElement(By.xpath("//iFrame[@class='demo-frame']"));
		driver.switchTo().frame(switchFrames);

		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.clickAndHold(drag).moveToElement(drop).release().build().perform();
	}

}