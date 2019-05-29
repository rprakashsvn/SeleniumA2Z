package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlideBarConcepts {

	static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement frameSwitch = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameSwitch);

		WebElement silderBar = driver.findElement(By.xpath("//div[@id='slider']"));
		int silderBarWidth = silderBar.getSize().width;
		System.out.println("SilderBarWidth : " + silderBarWidth);

		WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

		Actions action = new Actions(driver);
		action.clickAndHold(slider);
		action.moveByOffset(100, 0).build().perform();
		Thread.sleep(5000);
		
		driver.quit();

	}
}
