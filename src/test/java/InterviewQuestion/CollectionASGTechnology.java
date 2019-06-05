package InterviewQuestion;

import java.util.Arrays;
import java.util.List;

public class CollectionASGTechnology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List<String> hobbies = Arrays.asList("alex", "Swiming", "Cricket");

		/*
		 * List<String> hobbies = new ArrayList<String>(); hobbies.add("alex",
		 * "Swiming", "Cricket"); hobbies.add("John", "Painting", "Swiming", "Cricket");
		 * hobbies.add("Michael", "Singing", "Musician", "Reading");
		 */

		List<String> CollectionASGTechnology = Arrays.asList("alex", "brian", "charles");

		for (int i = 0; i <= CollectionASGTechnology.size(); i++) {
			if (CollectionASGTechnology.contains("brian")) {
				System.out.println(CollectionASGTechnology.get(0));
				break;
			}
		}

		/*
		 * for (String values : namesList) {
		 * 
		 * if (values.contains("brian")) { System.out.println(values); } }
		 */
	}
}
