package pavanSDET_QA;

import org.testng.annotations.Test;

//https://www.youtube.com/watch?v=e3x0bnOrcAA&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=15
public class Java15PrintEvenAndOddNumbersFromAnArray {
	@Test
	public void evenAndOddNumbersFromAnArrayUsingForLoop() {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Even numbers in array........");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i] + " ");
			}
		}
		System.out.println("Odd numbers in array........");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i] + " ");
			}
		}
	}

	@Test
	public void evenAndOddNumbersFromAnArrayUsingEnhancedForLoop() {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Even numbers in array........");
		for (int value : a) {
			if (value % 2 == 0) {
				System.out.println(value + " ");
			}
		}
		System.out.println("Odd numbers in array........");
		for (int value : a) {
			if (value % 2 != 0) {
				System.out.println(value + " ");
			}
		}
	}

}
