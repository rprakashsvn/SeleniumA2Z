/*package DBConnections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DesiredCap {

	static WebDriver driver1 = null;
	static WebDriver driver2 = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver_V2.44.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers\\Geckodriver_V0.23.0.exe");

		driver1 = new ChromeDriver();
		driver2 = new FirefoxDriver();

		driver1.get("https://cacert.org/");
		driver2.get("https://cacert.org/");

		driver1.manage().window().maximize();
		driver2.manage().window().maximize();

		driver1.quit();
		driver2.quit();
	}

}
*/