package Basics;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinkTest {

	static WebDriver driver = null;
	static String testurl = "https://test.mymsc.com/myMSC/";
	static int statuscode;

	public static void main(String[] args) throws Exception {

		String str2;
		String[] arrstr = { "AP", "TG", "DEL" };
		str2 = String.join(",", arrstr);
		System.out.println(str2);

		ChromeOptions options = new ChromeOptions();
		// disable automation info bar
		options.addArguments("disable-infobars");
		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver(options);
		driver.get(testurl);
		Dimension size = new Dimension(1500, 1500);
		driver.manage().window().setSize(size);

		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		List<WebElement> urlList = driver.findElements(By.tagName("a"));
		System.out.println("Total URL's In WebPage : " + urlList.size());

		for (int i = 0; i < urlList.size(); i++) 
		{
			String listURL = urlList.get(i).getAttribute("href");
			if (listURL.startsWith(testurl) && !listURL.startsWith("java")) {
				URL myURL = new URL(listURL);
				HttpURLConnection httpConnection = (HttpURLConnection) myURL.openConnection();
				httpConnection.setConnectTimeout(2000);
				httpConnection.connect();
				statuscode = httpConnection.getResponseCode();
				if (statuscode == 200) {
					System.out.println("URL & Status : " + myURL + " --> " + statuscode + " --> " + "Valid URL");
				} else {
					System.out.println("URL & Status : " + myURL + " --> " + statuscode + " --> " + "InValid URL");
				}
			}
		}
	}
}
