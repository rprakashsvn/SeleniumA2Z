package TestNG;

import org.testng.annotations.Test;

public class ExceptionsTests {

	@Test(expectedExceptions = ArithmeticException.class, description = "Exceptions Added")
	public void ExceptionsVefried1() {

		int i = 1 / 1;
		System.out.println("Infinity " + i);
	}

	@Test(description = "No Exceptions Added")
	public void ExceptionsVefried2() {

		int i = 2 / 1;
		System.out.println("Infinity " + i);
	}
}
