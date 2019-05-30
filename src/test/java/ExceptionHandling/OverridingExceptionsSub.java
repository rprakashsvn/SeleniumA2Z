package ExceptionHandling;

class Parent {
	void show() {
		System.out.println("Parent's show()");
	}
}

class Child extends Parent {
	// This method overrides show() of Parent
	@Override
	void show() {
		System.out.println("Child's show()");
	}
}

class OverridingExceptionsSub 
{
	public static void main(String[] args) {
		Parent sup = new Parent();
		sup.show();

		Parent s = new Child();
		s.show();
	}
}
