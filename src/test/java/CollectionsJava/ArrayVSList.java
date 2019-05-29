package CollectionsJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVSList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Arun");
		arrayList.add("Balaji");
		arrayList.add("Suresh");
		arrayList.add("Prakash");
		arrayList.add("Pandian");
		arrayList.add("Jagan");
		arrayList.add("Rajesh");

		List<String> linkedList = new LinkedList<String>();
		linkedList.add("Arun");
		linkedList.add("Balaji");
		linkedList.add("Suresh");
		linkedList.add("Prakash");
		linkedList.add("Pandian");
		linkedList.add("Jagan");
		linkedList.add("Rajesh");

		System.out.println("Array  List : " + arrayList);
		System.out.println("Linked List : " + linkedList);

		System.out.println("Linked List : ");
		for (String arrList : arrayList) {
			System.out.println(arrList);
		}

		System.out.println();

		System.out.println("Linked List : ");
		for (String LLList : linkedList) {
			System.out.println(LLList);
		}
	}
}
