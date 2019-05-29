package OOPSConcepts;

class ConstructorChaining {

	ConstructorChaining() {
		this(10);
	}

	ConstructorChaining(int a) {
		System.out.println("Constructor Chaining : " + a);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		ConstructorChaining callCont = new ConstructorChaining();
	}

}
