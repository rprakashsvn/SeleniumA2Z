package OOPSConcepts;

public class OverLoading {

	// Method Overloading is same method name but different arugments.

	public int Add(int a, int b) {
		int c = a + b;
		System.out.println(c);
		return c;
	}

	public double Add(int a, double b) {

		double c = a + b;
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverLoading obj = new OverLoading();
		obj.Add(5, 5.5);
		obj.Add(10, 10);
	}
}
