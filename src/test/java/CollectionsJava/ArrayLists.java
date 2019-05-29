package CollectionsJava;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLists {

	@SuppressWarnings("rawtypes")
	static ArrayList empDetails = new ArrayList();

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		File filePath = new File("My Profile.txt");
		String fileLoc = filePath.getAbsolutePath();
		System.out.println(fileLoc);

		empDetails.add("485");
		empDetails.add("Prakashpandian Rajaram");
		empDetails.add("Msc Technology India Pvt Ltd");
		empDetails.add("Software Testing Executive");
		empDetails.add("DOJ - 12-Oct-15");
		System.out.println(empDetails);

		System.out.println("Emp ID 		- " + empDetails.get(0));
		System.out.println("Emp Name 	- " + empDetails.get(1));
		System.out.println("Emp Company 	- " + empDetails.get(2));
		System.out.println("Emp Designation - " + empDetails.get(3));
		System.out.println("Emp DOJ 	- " + empDetails.get(4));

		Collections.sort(empDetails);
		System.out.println(empDetails);

		empDetails.add(5, "Ambattur");
		System.out.println("Office Location - " + empDetails.get(5));

		boolean empty = empDetails.isEmpty();
		System.out.println("List is Empty Or Not ? - " + empty);

		System.out.println("Using Iterator");
		Iterator<String> it = empDetails.iterator();
		while (it.hasNext()) {
			String listValues = it.next();
			System.out.println(listValues);
		}
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("Java");
		strList.add("Python");
		strList.add("Android");
		
	}
}

