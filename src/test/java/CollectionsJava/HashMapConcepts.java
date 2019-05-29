package CollectionsJava;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapConcepts {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Map<String, String> dataMap = new HashMap<String, String>();
		Map<Integer, Integer> testData = new HashMap<Integer, Integer>();

		System.out.println("Initial list of elements : " + dataMap);

		dataMap.put("1", "Rajesh");
		dataMap.put("2", "Jegadees");
		dataMap.put("3", "Prakash");

		testData.put(1, 15);
		testData.put(2, 10);
		testData.put(3, 12);

		System.out.println(dataMap.get("3"));

		for (Map.Entry<String, String> values : dataMap.entrySet()) {
			System.out.println(values.getKey() + " " + values.getValue());
		}

		dataMap.putIfAbsent("4", "Rajaram");

		for (Map.Entry<String, String> values1 : dataMap.entrySet()) {
			System.out.println(values1.getKey() + " " + values1.getValue());
		}

		Map<String, String> newDataMap = new HashMap<String, String>();
		newDataMap.putAll(dataMap);

		System.out.println("New Data Map : " + newDataMap);
		System.out.println(newDataMap.size());
		System.out.println(newDataMap.keySet());
		System.out.println(newDataMap.containsValue("Raj"));
		System.out.println("Entry Set " + newDataMap.entrySet());
		System.out.println(newDataMap.isEmpty());
		System.out.println(newDataMap.replace("3", "Prakash", "Pandian"));
		System.out.println(newDataMap.entrySet());
		System.out.println("Removed : " + newDataMap.remove("3"));
		System.out.println(Collections.max(testData.values()));
	}
}
