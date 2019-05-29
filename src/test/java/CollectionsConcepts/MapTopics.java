package CollectionsConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTopics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> dataMap = new HashMap<String, String>();
		dataMap.put("1", "Prakash");
		dataMap.put("2", "Rajaram");
		dataMap.put("3", "Pandian");

		System.out.println(dataMap);

		for (Entry<String, String> val : dataMap.entrySet()) {

			System.out.println(val.getKey() + "_" + val.getValue());
		}
	}
}
