package CollectionsJava;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class ReverseStringWithOutMethods {

	static Logger log = Logger.getLogger(ReverseStringWithOutMethods.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		log.setLevel(Level.OFF);

		String revereString = "Pandian";
		String revstring = "";
		System.out.println("Given String Is :  " + revereString);
		log.info("Printed Given Stirng");

		for (int i = revereString.length() - 1; i >= 0; i--) {

			revstring = revstring + revereString.charAt(i);
		}
		System.out.println("Reversed String Is :  " + revstring);
		log.info("Given Stirng Reversed");
	}
}
