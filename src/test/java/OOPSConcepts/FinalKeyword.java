package OOPSConcepts;

public class FinalKeyword {

	static int num1 = 10;

	public static void main(String[] args) {

		int num2 = 20;
		int num3 = 5;
		num1 = num2;
		num2 = num3 + num1;
		System.out.println(num1);
		System.out.println(num2);

		String username = "Prakash";
		System.out.println(username);
		System.out.println("toString :" + String.valueOf(username.hashCode()));
		System.out.println("toString :" + username);
		
		StringBuilder myName = new StringBuilder("Testing");
		System.out.println(myName);
		
		

	}
}
