package pavanSDET_QA;

import java.util.Scanner;
import org.testng.annotations.Test;

//https://www.youtube.com/watch?v=ovZ-GFheu3g&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=9
public class Java09FindLargestOf3Numbers {
	@Test
	public void test1() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int a = sc.nextInt();

		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();

		System.out.println("Enter Third Number: ");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " is Largest Number");
		} else if (b > c && b > a) {
			System.out.println(b + " is Largest Number");
		} else {
			System.out.println(c + " is Largest Number");
		}
		sc.close();

	}

	@Test
	public void ternaryOperator() {
		int a = 20, b = 50, c = 30;
		int largest = c > (a > b ? a : b) ? c : (a > b ? a : b);
		System.out.println(largest + " is Largest Number");

	}

}
