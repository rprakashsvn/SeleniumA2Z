package CollectionsJava;

import java.util.ArrayList;
import java.util.List;

public class JDK11CollectionFunctions {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<>();
		strList.add("Java");
		strList.add("Python");
		strList.add("Android");

		/*String[] strArray = strList.toArray(size -> new String[size]);
		System.out.println(Arrays.toString(strArray));

		strArray = strList.toArray(size -> new String[size + 5]);
		System.out.println(Arrays.toString(strArray));

		strArray = strList.toArray(size -> new String[size * 3]);
		System.out.println(Arrays.toString(strArray));*/
	}
}
