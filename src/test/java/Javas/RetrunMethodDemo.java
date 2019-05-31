package Javas;

class BaseClasses {

	// Local Variable
	// Static Variable
	// Instance Variable

	static String firstName = "Prakash"; // Static Variable
	String lastName = "Pandian";
	int xyz = 100; // Instance variable

	public void TestMethod1() {
		int abc = 50; // Local Variable
		System.out.println("Base Class Test Method 1");
		System.out.println("my Last Name Is : " + lastName);
		System.out.println(abc);
		System.out.println(xyz);
		System.out.println(firstName);
		// String name = TestMethod2();
		int ages = TestMethod2();
		ages++;
		if (ages == 27) {
			System.out.println("Yes, I'm Siva Sankar");
		} else {
			System.out.println("No, I'm Not Siva Sankar");
		}
	}

	@SuppressWarnings("unused")
	public static int TestMethod2() {
		String frinedName = "Siva";
		int age = 26;
		boolean isPresent = true;
		System.out.println("Base Class Test Method 2");
		System.out.println("my first Name Is : " + firstName);
		return age;
	}

	public String myName() {

		System.out.println(TestMethod2());
		String className = this.getClass().getSimpleName();
		return className;
	}
}

public class RetrunMethodDemo {

	public static void main(String[] args) {
		BaseClasses obj = new BaseClasses();
		obj.TestMethod1();
		BaseClasses.TestMethod2();
		System.out.println(BaseClasses.firstName);
		System.out.println(obj.myName());
	}
}
