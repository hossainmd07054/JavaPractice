package pavanSDET_QA;

import java.util.Scanner;

//https://www.youtube.com/watch?v=8BlUi4-4N4E&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=5
public class Java05PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		String str = sc.next();
		String org_str = str;
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (org_str.equals(rev)) {
			System.out.println(org_str + " Palindrome String");
		} else {
			System.out.println(org_str + " not Palindrome String");
		}
		sc.close();
	}

}
