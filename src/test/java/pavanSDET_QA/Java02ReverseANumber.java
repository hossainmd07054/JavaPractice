package pavanSDET_QA;

import java.util.Scanner;
import org.testng.annotations.Test;

//https://www.youtube.com/watch?v=m0lMpNIG6vU&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=2
public class Java02ReverseANumber {

	@Test
	public void usingScanner() {
		// Using algorithm

//		System.out.println("Enter a number: ");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		int num = 123456;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;// 0*10+1234%10 = 4
			num = num / 10;// 1234/10 = 123
		}
		System.out.println("Reverse Number is " + rev);
	}

	@Test
	public void usingStringBuffer() {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

//		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer sb = new StringBuffer();
		sb.append(num);
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse Number is " + rev);
		sc.close();

	}

	@Test
	public void usingStringBuilder() {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		StringBuilder sbl = new StringBuilder(String.valueOf(num));
//		StringBuilder sbl = new StringBuilder();
//		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println("Revers Number is: " + rev);
		sc.close();

	}

	@Test
	public void test() {
		int a = 123456;
		int b = 10;
		System.out.println(a / b);
	}

}
