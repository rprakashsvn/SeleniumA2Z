package Basics;

import java.io.BufferedReader;
import java.io.FileReader;

public class read_notepad 
{
	public static void main(String[] args) throws Exception 
	{
		FileReader inputFile = new FileReader("C:\\Users\\prakash.r\\Desktop\\Login.txt");
		BufferedReader readFile = new BufferedReader(inputFile);
		String FileContent = "";
		while ((FileContent = readFile.readLine()) != null) 
		{
			System.out.println(FileContent);		
		}	
		readFile.close();
	}
}