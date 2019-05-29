package Basics;

public class RandomNumberGen {
	
	public void randomNumber() {
		int random = (int) (Math.random() * 1000);
		System.out.println(random);
	}

	public static void main(String[] args) {

		RandomNumberGen rands = new RandomNumberGen();
		rands.randomNumber();
	}

}
