package Basics;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImageTest {

	static WebDriver driver = null;
	private static int invalidImageCount;

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/broken_images");
		driver.manage().window().maximize();

		invalidImageCount = 0;
		List<WebElement> getAllImages = driver.findElements(By.tagName("img"));
		System.out.println("Total Images In the Websites : " + getAllImages.size());

		for (WebElement getImage : getAllImages) {

			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(getImage.getAttribute("src"));
			HttpResponse response = client.execute(request);
			System.out.println(response.getStatusLine().getStatusCode());
			// verifying response code he HttpStatus should be 200 if not,
			// increment as invalid images count
			if (response.getStatusLine().getStatusCode() != 200) {
				System.out.println("Total no. of invalid images are " + " - " + invalidImageCount);
			}
		}
		driver.quit();
	}
}
