package OOPSConcepts;

class ConstructorConcepts {

	// Constructor doesn't have return type
	// Constructor will invoke while create the object.
	// Constructor in Java can not be abstract, static, final or synchronized.

	// Default Constructor
	public ConstructorConcepts() {
		System.out.println("Default Constructors");
	}

	// Parameterized constructor
	public ConstructorConcepts(int a, int b) {
		System.out.println("Two Parameters Constructors : " + a + " " + b);
	}

	// Parameterized constructor
	public ConstructorConcepts(String firstName, String lastName) {

		System.out.println("Three Parameters Constructors : " + firstName + " " + lastName);
	}
}

public class ConstructorTopic {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Creating object it will invoke it
		ConstructorConcepts object1 = new ConstructorConcepts();
		ConstructorConcepts object2 = new ConstructorConcepts(10, 20);
		ConstructorConcepts object3 = new ConstructorConcepts("Prakash", "Pandian");
	}

}
