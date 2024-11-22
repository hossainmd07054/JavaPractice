package pavanSDET_QA;

import java.util.Scanner;
//https://www.youtube.com/watch?v=dTWfNdfpr_g&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=27
public class Java27CountWordsInAString {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
