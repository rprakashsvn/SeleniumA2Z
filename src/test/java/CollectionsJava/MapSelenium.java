package CollectionsJava;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapSelenium {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Map<String, String> dataMap = new LinkedHashMap<String, String>();

		System.out.println("Initial list of elements : " + dataMap);

		dataMap.put("1", "Rajesh");
		dataMap.put("2", "Jegadees");
		dataMap.put("3", "Prakash");
		dataMap.put("4", "Pandian");
		dataMap.put("5", "Leelavathi");
		dataMap.put("6", "Rajaram");
		dataMap.put("7", "Gopi");

		System.out.println(dataMap.entrySet());

		int ratingArray[] = { 5, 5, 5, 5, 5, 5, 5 };
		int i = 0;

		for (Map.Entry<String, String> vals : dataMap.entrySet()) {

			// System.out.println(vals.getKey() + "" + vals.getValue() + ratingArray[i]);
			System.out.println(ratingArray[i]);
			i++;
		}
	}

}
