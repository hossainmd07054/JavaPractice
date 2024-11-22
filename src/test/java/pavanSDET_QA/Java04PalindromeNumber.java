package pavanSDET_QA;

import java.util.Scanner;
//https://www.youtube.com/watch?v=kNE3vq1g2e8&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=4

public class Java04PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		int org_num = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (org_num == rev) {
			System.out.println(org_num + " Palindrome Number");
		} else {
			System.out.println(org_num + " not Palindrome Number");
		}
		sc.close();

	}
}
