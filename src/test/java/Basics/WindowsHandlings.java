package Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlings {

	static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.stqatools.com/Windows.php");
		driver.manage().window().maximize();

		String mainWindow = driver.getWindowHandle();
		System.out.println("Main Window Name : " + mainWindow);
		driver.findElement(By.xpath("//button[text()=' Click to open new Tab ']")).click();

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("Total No Of TAB : " + allWindows.size());

		for (String tabNames : allWindows) {

			if (!tabNames.equals(mainWindow)) {
				driver.switchTo().window(tabNames);
				System.out.println("URL of New Page Is : " + driver.getCurrentUrl());
				System.out.println("Title of New Page Is : " + driver.getTitle());
			}
		}

		// Select Java Tutorials
		driver.findElement(By.xpath("(//span[@class='menu-item-text'])[2]")).click();

		System.out.println("Java Tutorial Page Is Navigated");

		String getURL = driver.getCurrentUrl();
		System.out.println("URL Is : " + getURL);
		if (getURL.contains("java")) {
			System.out.println("Its Java Page");
		}

		Thread.sleep(5000);
		driver.switchTo().window(mainWindow);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Click to open new Window ']")).click();

		Set<String> switchWindos = driver.getWindowHandles();
		System.out.println("Total No Of TAB : " + switchWindos.size());

		int i = 0;
		for (String tabDetails : switchWindos) {
			i = i + 1;
			System.out.println(i + " ) " + tabDetails);
			i++;
		}

		for (String windowsList : switchWindos) {
			int j = 0;
			if (!windowsList.equals(mainWindow)) {
				String currentURL = driver.getCurrentUrl();
				j = j + 1;
				System.out.println("Current URL : " + currentURL + " - " + j);

				driver.switchTo().window(windowsList);
				driver.findElement(By.xpath("//button[text()=' New Message Window ']")).click();
				String getBodyTexts = driver.findElement(By.tagName("Body")).getText();
				System.out.println("New Message Window Text Is : " + getBodyTexts);
			}
			j++;
		}
	}
}
