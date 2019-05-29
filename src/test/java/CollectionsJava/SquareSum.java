package CollectionsJava;

public class SquareSum {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 5; i >= 1; i--) {
			if (i % 2 != 0) {
				if (sum < (i * i)) {
					sum = (i * i) - sum;
				} else {
					sum = sum - (i * i);
				}
			} else {
				sum = sum + (i * i);
			}
		}
		System.out.println(sum);
	}
}
