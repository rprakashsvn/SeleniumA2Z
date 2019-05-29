package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadlessBrowserDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.inviul.com/blog/");
		driver.manage().window().maximize();
		System.out.println("Title of the page is- " + driver.getTitle());
		driver.quit();
	}
}