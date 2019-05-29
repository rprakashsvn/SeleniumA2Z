package Basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemoRobotClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://encodable.com/uploaddemo/");
		driver.manage().window().maximize();
		
		// File Name
		String fileName = "C:\\Users\\prakash.r\\Desktop\\Tracking.txt";
		// Transferable File Name declaration
		StringSelection contents = new StringSelection(fileName);
		// Getting toolkit
		Toolkit toolKit = Toolkit.getDefaultToolkit();
		// Getting clipboard as file upload window
		Clipboard clipBoard = toolKit.getSystemClipboard();
		// Copying string file name to the file upload window
		clipBoard.setContents(contents, null);
		System.out.println("File Selection- " + contents);
		Thread.sleep(5000);
		// This will click on Browse button
		driver.findElement(By.id("uploadname1")).click();
		Robot robot = new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
