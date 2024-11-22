package pavanSDET_QA;

import org.testng.annotations.Test;
//https://www.youtube.com/watch?v=uYLkKT-VrmM&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=28
public class Java28ReverseEachWordInAString {

	@Test
	public void usingForLoop() {
		String str = "Welcome To Java And Selenium";
		System.out.println(str);
		String[] words = str.split(" "); // or
//		String[] words = str.split("\\s");
		String reverseString = "";
		for (String w : words) {
			String reverseword = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				reverseword = reverseword + w.charAt(i);
			}
			reverseString = reverseString + reverseword + " ";
		}
		System.out.println(reverseString);
	}

	@Test
	public void usingStringBuilder() {
		String str = "Welcome To Java And Selenium";
		System.out.println(str);
//		String[] words = str.split(" "); // or
		String[] words = str.split("\\s");
		String reverseString = "";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			StringBuilder reverseword = sb.reverse();
			reverseString = reverseString + reverseword + " ";			
		}
		System.out.println(reverseString);
		System.out.println(reverseString.toUpperCase());
		System.out.println(reverseString.toLowerCase());
		System.out.println(reverseString.toString());
	}

}
