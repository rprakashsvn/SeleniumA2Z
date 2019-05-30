package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadingFiles {

	static String filePath = "C:\\Users\\prakash.r\\Desktop\\Login.txt";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File loadFile = new File(filePath);
		FileReader fr = new FileReader(loadFile);
		BufferedReader br = new BufferedReader(fr);

		String values = "";

		while ((values = br.readLine()) != null) {
			System.out.println(values);
		}
	}
}
