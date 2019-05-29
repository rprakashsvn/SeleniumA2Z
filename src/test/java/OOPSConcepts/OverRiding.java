package OOPSConcepts;

class OverRidingMain {

	// Method Overloading is same method name, Same arugment we have to use 2

	public void test(int a, int b) { // Overridden method
		System.out.println("Super Class Method");
	}
}

class OverRiding extends OverRidingMain {

	public void test(int a, int b) { // Overridden method
		super.test(5, 15);
		System.out.println("Sub Class Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating Object for sub class with reference of super class and able to
		// access Super / Sub Classes
		OverRidingMain superClassRef = new OverRiding();
		superClassRef.test(5, 10);
	}
}
