package pavanSDET_QA;

import org.testng.annotations.Test;

//https://www.youtube.com/watch?v=BDvYp3GbfU4&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=14
public class Java14SumOfElementsInArray {

	@Test(priority = 1)
	public void sumOfElementsInArrayUsingLoop() {
		int a[] = { 5, 2, 7, 6, 9 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of Array elements: " + sum);
	}

	@Test(priority = 2)
	public void sumOfElementsInArrayUsingEnhancedForLoop() {
		int a[] = { 5, 2, 7, 6, 9, 6, 10, 25 };
		int sum = 0;
		for (int value : a) {
			sum = sum + value;
		}
		System.out.println("Sum of Array elements: " + sum);
	}

}
