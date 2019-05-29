package Basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowserDimension {

	static String googleURL = "https://www.google.com/";

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(googleURL);
		Dimension d = new Dimension(900, 900);
		driver.manage().window().setSize(d);

		WebElement ele = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[3]/center/input[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", ele);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File SrcFile = ts.getScreenshotAs(OutputType.FILE);
		String tempFilePath = "./Logs\\Test.PNG";
		File destFile = new File(tempFilePath);
		FileUtils.copyFile(SrcFile, destFile);

		driver.quit();
		Runtime.getRuntime().exec("taskkill /F /IM Chromedriver_V2.44.exe");
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
	}
}
