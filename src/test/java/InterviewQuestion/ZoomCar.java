package InterviewQuestion;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	static ChromeDriver driver;
	static int getKeyNumber;
	static Map<Integer, Integer> priceMatch = new HashedMap<Integer, Integer>();

	public static void main(String[] args) {

		launchBrowser();
		startingPoint();
		pickdropPoint();
		lowPrice();
	}

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void startingPoint() {
		driver.findElementByXPath("//a[text()='Start your wonderful journey']").click();
		driver.findElementByXPath("(//div[@class='items'])[1]").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
	}

	public static void pickdropPoint() {

		// Fetch the Current Date
		Date date = new Date();
		// Gets the DateFormat alone
		SimpleDateFormat dateFormats = new SimpleDateFormat("dd");
		String Today = dateFormats.format(date);
		int tomoDate = Integer.parseInt(Today) + 1;
		// System.out.println(tomoDate);
		driver.findElementByXPath("//div[contains(text(),'" + tomoDate + "')]").click();
		// driver.findElementByXPath("//div[text()='"+ tomoDate +"']").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]")).click();
	}

	public static void lowPrice() {
		System.out.println("*****Price List*****");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='price']"));
		System.out.println("Total Cars List Is : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			String price = list.get(i).getText();
			price = price.replaceAll("[^\\d]", "");
			int k = Integer.parseInt(price);
			int count = i + 1;
			priceMatch.put(count, k);
		}

		System.out.println(priceMatch.entrySet());
		int maxValueInMap = (Collections.max(priceMatch.values())); // This will return max value in the Hashmap
		int minValueInMap = (Collections.min(priceMatch.values()));
		System.out.println("Max Values Is in the List :" + maxValueInMap);
		System.out.println("Min Values Is in the List :" + minValueInMap);

		for (Entry<Integer, Integer> entry : priceMatch.entrySet()) { // Itrate through hashmap
			if (entry.getValue() == maxValueInMap) {
				getKeyNumber = entry.getKey(); // Print the key with max value
				System.out.println(getKeyNumber);
			}
		}

		String nameOfCar = driver.findElement(By.xpath("(//div[@class='details'])[" + getKeyNumber + "]")).getText();
		System.out.println("Name of the Car is : " + nameOfCar);
	}
}
