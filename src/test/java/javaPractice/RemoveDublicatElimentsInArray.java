package javaPractice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class RemoveDublicatElimentsInArray {
	@Test
	public void test1() {
		int arr[] = { 5, 10, 20, 30, 10, 20, 10, 50, 10, 5, 8, 6, 6, 6, 6, 6, 10, 4, 1, 3, 100, 5, 100, 100 };
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));		
		int b = 0;
		arr[b] = arr[0];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			if (arr[b] != arr[i]) {
				b++;
				arr[b] = arr[i];
			}
		}
		System.out.print("\n");
		for (int i = 0; i <= b; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

//--------------------------------------------------------------------------------	
	@Test
	public void test2() {
		int arr[] = { 5, 10, 10, 10, 10, 20, 30, 10 };
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		System.out.print("\n");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					i++;
				}
			}
			System.out.print(arr[i] + "\t");
		}
	}

//--------------------------------------------------------------------------------
	@Test
	public void test3() {
		int arr[] = { 5, 10, 20, 30, 10, 20, 10, 50, 10, 5, 8, 6, 6, 6, 6, 6, 10, 4, 1, 3, 100, 5, 100, 100 };

		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {// 5>2
					temp = arr[j];// 2
					arr[j] = arr[i];// 5
					arr[i] = temp;// 2
				}
			}
		}
		int b = 0;
		arr[b] = arr[0];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			if (arr[b] != arr[i]) {
				b++;
				arr[b] = arr[i];
			}
		}
		System.out.print("\n");
		for (int i = 0; i <= b; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

// ---------------------------------------------------------------------------------------
	@Test
	public void test4() {
		int a[] = { 5, 10, 20, 30, 10, 20, 10, 50, 10, 5, 8, 6, 6, 6, 6, 6, 10, 4, 1, 3, 100, 5, 100, 100 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int j = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j] = a[i];
				j++;
			}
		}
		a[j] = a[a.length - 1];
		for (int i = 0; i <= j; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
