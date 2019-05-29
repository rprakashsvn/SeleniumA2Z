package CollectionsJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	static LinkedList<String> listValues1 = new LinkedList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		listValues1.add("485");
		listValues1.add("Prakash");
		listValues1.add("Msc");
		listValues1.add("Testing");
		listValues1.add("Ambattur");

		System.out.println(listValues1 + "\n");

		System.out.println("Using Iterator Loop");
		Iterator<String> it = listValues1.iterator();
		while (it.hasNext()) {
			String empDetails = it.next();
			System.out.println(empDetails);
		}

		listValues1.add(2, "Rajaram");
		System.out.println(listValues1 + "\n");

		LinkedList<String> listValues2 = new LinkedList<String>();
		listValues2.addAll(listValues1);
		listValues2.addLast("Chennai");
		System.out.println(listValues2);
	}

}
