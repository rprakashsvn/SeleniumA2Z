package CollectionsJava;

public class OddOREven {

	static int[] numbers = { 10, 15, 20, 25, 30, 37 };

	public static void main(String[] args) {

		for (int i = 0; i < numbers.length; i++) {

			int OddEven = 0;
			OddEven = numbers[i] % 2;

			if (OddEven == 0) {
				System.out.println("Even Number : " + numbers[i]);
			} else {
				System.out.println("Odd Number  : " + numbers[i]);
			}
		}

	}

}
