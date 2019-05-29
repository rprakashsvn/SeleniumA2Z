package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteTextFile {

	static String filePath = "C:\\Users\\prakash.r\\Desktop\\IPSS.txt";
	static File uploadFile = new File(filePath);

	public static void main(String[] args) throws Exception {

		ReadWriteTextFile.WriteFile();
		ReadWriteTextFile.ReadFile();
	}

	public static void WriteFile() throws Exception {
		boolean fileExisits = uploadFile.exists();
		System.out.println("File Exists or not ? : " + fileExisits);

		if (fileExisits == false) {
			uploadFile.createNewFile();
			System.out.println("File Is Not Exists Created New File : " + uploadFile.getName());
		}

		FileWriter fw = new FileWriter(uploadFile);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello Prakash");
		bw.newLine();
		bw.write("Welcome To Java Prakash");
		bw.newLine();
		bw.write("Welcome To Python Prakash");
		bw.newLine();
		bw.write("Welcome To C# Prakash");
		bw.close();
		System.out.println("File has been writted successfully");
		System.out.println();
	}

	public static void ReadFile() throws Exception {
		boolean fileExisits = uploadFile.exists();
		System.out.println("File Exists or not ? : " + fileExisits);

		boolean isRead = uploadFile.canRead();
		System.out.println("isRead : " + isRead);
		boolean isWrite = uploadFile.canWrite();
		System.out.println("isWrite : " + isWrite);
		boolean isExecute = uploadFile.canExecute();
		System.out.println("isExecute : " + isExecute);

		if (fileExisits == false) {
			System.out.println("File Is Not Available in the given path");
		}

		FileReader fw = new FileReader(uploadFile);
		BufferedReader br = new BufferedReader(fw);
		String content = "";
		while ((content = br.readLine()) != null) {
			System.out.println(content);
		}
		System.out.println("File has been readed successfully");
		br.close();
	}
}
