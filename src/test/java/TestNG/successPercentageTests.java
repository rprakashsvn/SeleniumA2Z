package TestNG;

import java.io.IOException;

import org.testng.annotations.Test;

public class successPercentageTests {

	@Test(enabled = true, description = "successPercentage", successPercentage = 80, threadPoolSize = 10)
	// invocationCount = 10 // if we mention the threadPoolSize, mandatory to
	// mention invocationCount
	public void successPercentageTesting1() {

		System.out.println("Success Percentage Testings");
		int i = 1 / 1;
		long threadID = Thread.currentThread().getId();
		System.out.println("Divided By : " + i);
		System.out.println("Thread ID  : " + threadID);
	}

	@Test(testName = "example", description = "example test", expectedExceptions = IOException.class, dataProvider = "dataProv", groups = {
			"functional", "stress" }, dependsOnGroups = "database", dependsOnMethods = { "init",
					"setup" }, enabled = false, successPercentage = 80, timeOut = 10000, invocationCount = 10, threadPoolSize = 10, sequential = true)
	public void successPercentageTesting2() {
	}
}
