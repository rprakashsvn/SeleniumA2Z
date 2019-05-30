package ExceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10, j = 0;
		System.out.println("Multiple Catch Blocks :");

		try {
			int x = i / j;
			System.out.println("Divided By Values Is : " + x);

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (UnknownError e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bound exception");
		}
	}
}
