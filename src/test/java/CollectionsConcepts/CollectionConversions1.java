package CollectionsConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionConversions1 {

	public static void main(String[] args) {

		// How to convert List to Set (ArrayList to HashSet)
		List<String> list = new ArrayList<String>();
		list.add("Prakash");
		list.add("Rajesh");
		list.add("Jegadees");
		list.add("Pandian");
		list.add("Rajaram");
		list.add("Prakash");

		System.out.println("Acutal List : " + list);

		// Convert List to HashSet
		Set<String> hashset = new HashSet<String>(list);
		System.out.println("Hash Set : " + hashset);

		// Convert List to LinkedHashSet
		Set<String> linkedhashset = new LinkedHashSet<String>(list);
		System.out.println("Linked Hash Set : " + linkedhashset);

		// Convert List to TreeSet
		Set<String> treeset = new TreeSet<String>(list);
		System.out.println("Tree Set : " + treeset);

		List<String> convertArrayList = Arrays.asList("Rajaram", "Rajesh", "Jegadees", "Prakash");
		System.out.println("Converted as List : " + convertArrayList);
	}

}
