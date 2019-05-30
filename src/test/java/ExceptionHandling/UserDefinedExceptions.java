package ExceptionHandling;

@SuppressWarnings("serial")
class myException extends Exception {

	private int ex;

	public myException(int a) {
		ex = a;
	}

	public String toString() {
		return "MyException[" + ex + "] is less than zero";
	}
}

public class UserDefinedExceptions {

	public static void sum(int a, int b) throws myException {
		if (a < 0) {
			throw new myException(a);
		} else {
			System.out.println("A Is Greater than given values");
		}
	}

	public static void main(String[] args) throws myException {

		try {

			UserDefinedExceptions.sum(-10, 5);
		} catch (myException e) {
			System.out.println(e);
		}

	}
}
