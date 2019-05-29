package CollectionsJava;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class NewClass4 {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 50);
		map.put(2, 60);
		map.put(3, 30);
		map.put(4, 10);
		map.put(5, 20);
		
		int maxValueInMap = (Collections.max(map.values())); // This will return max value in the Hashmap
		System.out.println("Max Values Is :" + maxValueInMap);
		
		for (Entry<Integer, Integer> entry : map.entrySet()) { // Itrate through hashmap
			if (entry.getValue() == maxValueInMap) {
				System.out.println(entry.getKey()); // Print the key with max value
			}
		}

	}
}