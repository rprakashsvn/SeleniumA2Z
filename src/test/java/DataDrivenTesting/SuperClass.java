package DataDrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SuperClass {

	public WebDriver driver;

	@AfterClass
	public void postCondition() throws InterruptedException {

		Thread.sleep(5000);
		driver.quit();
	}

	@BeforeClass
	public void preCondition() {

		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://test.mymsc.com/myMSC/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}