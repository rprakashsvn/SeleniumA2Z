package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class IEZoomMode {

	static WebDriver driver = null;
	String ClassNames1 = this.getClass().getName();
	String ClassNames2 = this.getClass().getSimpleName();

	@SuppressWarnings("deprecation")
	public void testMethod() {
		System.setProperty("webdriver.ie.driver", "./Drivers\\IEDriverServer_V3.14.0.exe");
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		driver = new InternetExplorerDriver(cap);
		driver.get("http://www.google.com");

		System.out.println("ClassNames1" + ClassNames1);
		System.out.println("ClassNames1" + ClassNames2);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String getDomainName = (String) js.executeScript("return document.domain");
		System.out.println("My Current URL Is  : " + getDomainName);
		
	}

	@Test
	public void Intensional_Skip() {
		System.out.println("In Verify_Title");
		String titl = driver.getTitle();

		if (titl.contains("google")) {
			// To Skip Test
			throw new SkipException("Test Check_Checkbox Is Skipped");

		} else {
			System.out.println("Check the Checkbox");
			driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		}
		System.out.println("After If Else");
	}

	public static void main(String[] args) {

		IEZoomMode zoomMode = new IEZoomMode();
		zoomMode.testMethod();
		zoomMode.Intensional_Skip();

	}
}
