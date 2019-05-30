package ExceptionHandling;

public class ArrayIndexExceptions {

	public static void main(String[] args) {

		try {
			int a[] = { 10, 20, 30, 40 };

			System.out.println("Values in Int Array : " + a[0]);
			System.out.println("Values in Int Array : " + a[1]);
			System.out.println("Values in Int Array : " + a[2]);
			System.out.println("Values in Int Array : " + a[3]);
			System.out.println("Values in Int Array : " + a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
