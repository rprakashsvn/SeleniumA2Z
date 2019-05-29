package Basics;

public class FindDuplicateString 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String name = "Selenium";
		int cnt = 0;

		char[] charArray = name.toCharArray();

		for (int i = 0; i <= name.length(); i++) {
			for (int j = i + 1; j < name.length(); j++) {
				if (charArray[i] == charArray[j]) {
					System.out.println(charArray[j]);
					cnt++;
					break;
				}
			}
		}
	}
}
