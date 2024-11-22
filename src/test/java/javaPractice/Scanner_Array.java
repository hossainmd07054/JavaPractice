package javaPractice;

import java.util.Scanner;

public class Scanner_Array {

	public static void main(String[] args) {
		int s = 0;
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		System.out.println("Enter 5 Numbers: ");
		int i;
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < a.length; i++) {
			s = s + a[i];
		}
		System.out.println("Average is" + s / a.length);
	}

}
