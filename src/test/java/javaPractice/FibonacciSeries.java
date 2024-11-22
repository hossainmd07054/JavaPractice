package javaPractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// int a = 0, b = 1, c = 2;
		// for (int i = 1; i <= 10; i++) {
		// c = a + b;
		// a = b;
		// b = c;
		// System.out.println(b);
		// }
		//
		// for (int i = 1, f = 0, n = 0; n < 15; n++, System.out.println(i = (f + (f +
		// i)) - (f = f + i)));
		//
		// int i =1;
		// int f =0;
		// for (int n = 0; n < 15; n++) {
		// i = ((f + (f + i)) - (f = f + i));
		// System.out.println(i);
		// }
		//
		// int a = 1;
		// int b = 0;
		// for (int i = 0; i < 15; i++) {
		// a = ((b + (b + a)) - (b = b + a));
		// System.out.println(a);
		// }
		// int x = 1;
		// int a = 0;
		// int t;
		// while (true) {
		// System.out.println(x);
		// t = x;
		// x = x + a;
		// a = t;
		// if (x > 50) {
		// break;
		// }
		// }
		// int firstNum = 0;
		// int secondNum = 1;
		// int nextNum = 3;
		// for (int i = 1; i < 47; i++) {
		// nextNum = firstNum + secondNum; 
		//
		// }
		// int a = 10;
		// int b = 20;
		// int temp;
		//
		// temp = a;// 10
		// a = b;// 20
		// b = temp;
		// System.out.println(a + "\n" + b);
		//
		// int a = 50;
		// int b = 20;
		// System.out.println(a + "\n" + b);
		// a = a + b;// 30
		// b = a - b;// 10
		// a = a - b;
		// System.out.println(a + "\n" + b);

		int arr[] = { 10, 15, 20, 9, 8, 5, 7, 6, 2, 8, 9, };
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		int temp;
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
