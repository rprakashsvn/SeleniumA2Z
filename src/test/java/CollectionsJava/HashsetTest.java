package CollectionsJava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class HashsetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listValues = new LinkedList<>();
		listValues.add("Arun");
		listValues.add("Balaji");
		listValues.add("Suresh");
		listValues.add("Prakash");
		listValues.add("Pandian");
		listValues.add("Jagan");
		listValues.add("Rajesh");

		System.out.println("Linked List : " + listValues);
		
		HashSet<String> set = new LinkedHashSet<String>(listValues);
		System.out.println("Hash Set List : " + set);

	}

}
