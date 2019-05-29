package Basics;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;

		System.out.println("Before Swappaing : " + x);
		System.out.println("Before Swappaing : " + y);

		x = x + y; // 10 + 20 = 30 - x
		y = x - y; // 30 - 20 = 10 - y
		x = x - y; // 30 - 10 = 20 - x

		System.out.println("After  Swappaing : " + x);
		System.out.println("After  Swappaing : " + y);

	}
}
