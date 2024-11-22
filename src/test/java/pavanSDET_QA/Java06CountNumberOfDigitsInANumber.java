package pavanSDET_QA;

import java.util.Scanner;

import org.testng.annotations.Test;
//https://www.youtube.com/watch?v=CnFBzBMEdMg&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=6
public class Java06CountNumberOfDigitsInANumber {
	@Test()
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		System.out.println("Number of Digits : " + count);
		sc.close();
	}

	@Test
	public void test2() {
		
		int number = 123456789;
		int count = 0;
		for (; number != 0; number /= 10) {
			count++;
		}
		System.out.println("Number of digits: " + count);
	}

}
