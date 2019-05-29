package OOPSConcepts;

class BaseClass {

	public void getName() {
		System.out.println("Hello");
	}

	public void CallgetNameMethod() {

		this.getName();
		System.out.println("Hello Word");
	}

}

class ThisKeywordConcepts {
	public static void main(String[] args) {

		BaseClass tests = new BaseClass();
		tests.CallgetNameMethod();
	}
}