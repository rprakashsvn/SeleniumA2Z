package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteTextFiles {

	public static void main(String[] args) throws Exception {

		File loadFile = new File("C:\\Users\\prakash.r\\Desktop\\New Text Document.txt");
		if (loadFile.exists() == false) {
			loadFile.createNewFile();
			System.out.println("New File Has been created");
		}

		FileWriter fw = new FileWriter(loadFile);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Written from Program");
		bw.newLine();
		bw.write("Hello Pandian");
		bw.close();
		System.out.println("File writted successfully");

		FileReader fr = new FileReader(loadFile);
		BufferedReader br = new BufferedReader(fr);

		String content = "";

		while ((content = br.readLine()) != null) {
			System.out.println(content);
		}
		br.close();
	}

}
