package JavaConcepts;

public class StaticBlocks {

	int x;
	int a = 100;
	static String name;
	transient String lastName = "Rajaram";

	static {
		name = "Prakash";
		System.out.println("Static Block 1 Executed Before main method");
	}

	static {
		name = "Pandian";
		System.out.println("Static Block 2 Executed Before main method");
	}

	public void TestMethod1() {
		System.out.println("Test Method 1 got executed : " + name);
	}

	public void TestMethod2() {
		System.out.println("Test Method 2 got executed : " + name);
	}

	public static void main(String[] args) {

		System.out.println("Main Method got executed");
		StaticBlocks SB = new StaticBlocks();
		SB.TestMethod1();
		SB.TestMethod2();
		SB.x = 10;
	}
}
