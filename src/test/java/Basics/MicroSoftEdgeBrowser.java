package Basics;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicroSoftEdgeBrowser {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.out.println("Started to Executing");
		System.setProperty("webdriver.edge.driver", "./Drivers\\MicrosoftWebDriver_V17134.exe");
		driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		Date getDateTime = new Date();
		System.out.println(getDateTime);
		
		Date getDateTime1 = new Date();
		System.out.println("Current Date & Time Is : " + getDateTime1);
		
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		String filePath = "./Screenshots\\Testing.JPEG";
		File destFile = new File(filePath);
		FileUtils.copyFile(srcFile, destFile);

		System.out.println("Executing Completed");
		
		driver.quit();
	}
}
