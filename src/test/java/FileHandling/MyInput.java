package FileHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class MyInput {
	public static void main(String[] args) throws Exception {
		
		String text;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		text = br.readLine(); // Reading String
		System.out.println(text);
		
	}
}