package JavaConcepts;

class GrandParent {
	void fun() {
		System.out.println("Grand Parent");
	}
}

class Parent1 {
	void fun() {
		System.out.println("Parenet 1");
	}
}

class Parent2 {
	void fun() {
		System.out.println("Parenet 2");
	}
}

public class MultipleInheritance extends Parent1 {

	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();
		obj.fun();
	}
}
