package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		int a = 0, b = 10;
		System.out.println("Single Try Catch Block :");

		try {

			int x = b / a;
			System.out.println("Divided By Values Is : " + x);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
