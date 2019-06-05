package TestNG;

import org.testng.annotations.Test;

public class TestNGGroupsConcetps {

	@Test(groups = { "Sanity" }, priority = 0)
	public void Test1() {
		System.out.println("Sanity Test 0");
	}

	@Test(groups = { "Sanity", "Smoke" }, priority = 1)
	public void Test2() {
		System.out.println("Sanity & Smoke Test 1");
	}

	@Test(groups = { "Sanity", "Smoke" }, priority = 2)
	public void Test3() {
		System.out.println("Sanity & Smoke Test 2");
	}

	@Test(groups = { "Sanity", "Regression" }, priority = 3)
	public void Test4() {
		System.out.println("Sanity & Regression Test 3");
	}

	@Test(groups = { "Regression", }, priority = 4)
	public void Test5() {
		System.out.println("Regression Test 4");
	}

}
