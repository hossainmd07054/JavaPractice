package pavanSDET_QA;

import org.testng.annotations.Test;
//https://www.youtube.com/watch?v=QqX1ExNAev0&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=10
public class Java10GenerateFibonacciSeries {

	@Test
	public void test1() {
		int a = 0, b = 1, c = 0;
		for (int i = 0; i < 10; i++) {
			c = a + b;
			System.out.print(a + " ");
			a = b;
			b = c;
		}
		System.out.print("\n");
	}

	@Test
	public void test2() {
		int n1 = 0, n2 = 1, sum = 0;
		System.out.print(n1 + " " + n2);
		for (int i = 0; i < 10; i++) {
			sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;
		}
		System.out.print("\n");
	}

	@Test
	public void test3() {
		for (int i = 1, f = 0, n = 0; n < 10; n++, System.out.print(i = (f + (f + i)) - (f = f + i)))
			;
		System.out.print("\n");
	}

	@Test
	public void test4() {
		int i = 1;
		int f = 0;
		for (int n = 0; n < 10; n++) {
			i = ((f + (f + i)) - (f = f + i));
			System.out.print(i + " ");
		}
	}

	@Test
	public void test5() {
		int first = 1;
		int second = 0;
		for (int i = 0; i < 10; i++) {
			first = ((second + (first + second)) - (second = first + second));
			System.out.println(first);
			System.out.println(second);
			System.out.println("----------------------------------------------------------" + first);
		}
	}

	@Test
	public void test6() {
		int a = 1;
		int b = 0;
		int n;
		while (true) {
			System.out.println(b);
			n = a + b;
			a = b;
			b = n;
			if (n > 100) {
				break;
			}
		}
	}

	@Test
	public void test7() {
		int firstNum = 0;
		int secondNum = 1;
		int nextNum = 0;
		for (int i = 0; i < 10; i++) {
			nextNum = firstNum + secondNum;
			System.out.print(" " + firstNum);
			firstNum = secondNum;
			secondNum = nextNum;
		}
	}

	
//		public void test2() {			
//
//		int arr[] = { 10, 15, 20, 9, 8, 5, 7, 6, 2, 8, 9, };
////		Arrays.sort(arr);
////		System.out.println(Arrays.toString(arr));
//		int temp;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//
//	}
	@Test
	public void asort() {
		int arr[] = { 10, 15, 20, 9, 8, 5, 7, 6, 2, 8, 9, };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
