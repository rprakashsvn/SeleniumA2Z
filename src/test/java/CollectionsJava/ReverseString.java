package CollectionsJava;

public class ReverseString {

	public static void main(String args[]) {

		StringBuffer sb = new StringBuffer("Pandian");
		System.out.println("Actual String : " + sb);

		sb.append(" Prakash");
		System.out.println("Append String  : " + sb);

		sb.reverse();
		System.out.println("After Revesre String  : " + sb);

		ReverseString reversed1 = new ReverseString();
		ReverseString reversed2 = reversed1;

		System.out.println(reversed1);
		System.out.println(reversed2);

	}

}
