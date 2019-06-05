package CollectionsConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class CollectionConversions2 {

	public static HashSet<String> convertList(List<String> convertArrayList) {
		return new HashSet<String>(convertArrayList);
	}

	public static void main(String[] args) {

		List<String> convertArrayList = Arrays.asList("Rajaram", "Rajesh", "Jegadees", "Prakash", "Rajesh");
		System.out.println("Converted as List : " + convertArrayList);

		System.out.println(CollectionConversions2.convertList(convertArrayList));

		LinkedList<String> LList = new LinkedList<String>();
		LList.push("A");
		LList.push("B");
		LList.push("C");
		LList.push("D");

		System.out.println("Linked List : " + LList);

		LList.pollFirst();
		System.out.println("poll First List : " + LList);

		LList.pollLast();
		System.out.println("poll Last List : " + LList);

		LList.peek();
		System.out.println("peek Linked List : " + LList);

		LList.toString();
		System.out.println("To String : " + LList);

	}

}
