package CollectionsJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ListTest {

	@SuppressWarnings("rawtypes")
	static ArrayList list = new ArrayList();

	@SuppressWarnings("unchecked")
	public static void main(String args[]) {

		list.add("Prakash");
		list.add("Vimal");
		list.add("Arun");
		list.add("Suresh");
		list.add("Bala");

		Collections.sort(list);

		System.out.println("Using Enhanced For Loop");
		for (Object names : list) {
			System.out.println(names);
		}
		System.out.println();

		System.out.println("Using Iterator Loop");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String names = it.next();
			System.out.println(names);
		}
		System.out.println();

		System.out.println("Using For Loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

		System.out.println("Using List through List Iterator");
		ListIterator<String> list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}
	}
}
