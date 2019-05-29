package CollectionsJava;

public class ArrayLoops {

	static int[] number = new int[49];

	public static void main(String[] args) {

		for (int i = 0; i <= number.length; i++) {

			number[i] = i + 1;
			System.out.println(number[i]);
		}
	}
}
