package Basics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetDomainName {

	static WebDriver driver;

	@Test
	public static void GetDomain() {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver();
		driver.get("https://test.mymsc.com/myMSC/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String domainName = (String) js.executeScript("return document.domain");
		System.out.println("Domain Name : " + domainName);

		boolean cookie = driver.findElement(By.xpath("/html/body/div[5]/div[3]/button")).isDisplayed();
		if (cookie == true) {
			driver.findElement(By.xpath("/html/body/div[5]/div[3]/button")).click();
		}

		driver.findElement(By.id("locationOther")).click();
		driver.findElement(By.name("UserName")).sendKeys("prakashpandian.rajaram@msc.com");
		driver.findElement(By.id("Password")).sendKeys("msc2018");
		driver.findElement(By.id("loginButton")).click();

		driver.quit();
		try {
			Runtime.getRuntime().exec("TASKKILL /IM Chromedriver_V2.44.exe /F");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
