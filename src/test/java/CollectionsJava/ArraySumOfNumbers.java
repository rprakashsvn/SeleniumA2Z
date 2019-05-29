package CollectionsJava;

import java.util.Arrays;

public class ArraySumOfNumbers {

	static int[] sumNumbers = { 15, 45, 5, 10, 65, 20 };

	static int i;
	static int arrayTotal = 0;
	static int average = 0;

	public static void main(String[] args) {

		for (int i = 0; i < sumNumbers.length; i++) {
			System.out.println((i + 1) + " - " + sumNumbers[i]);
		}

		System.out.println();

		for (i = 0; i < sumNumbers.length; i++) {
			arrayTotal = arrayTotal + sumNumbers[i];
			System.out.println((i + 1) + " - " + arrayTotal);
		}

		System.out.println("Total : " + arrayTotal);
		average = arrayTotal / sumNumbers.length;
		System.out.println("Average : " + average);

		Arrays.sort(sumNumbers);
		int HighestArrayNumber = sumNumbers.length - 1;
		System.out.println("Highest Number In List : " + sumNumbers[HighestArrayNumber]);
	}
}
