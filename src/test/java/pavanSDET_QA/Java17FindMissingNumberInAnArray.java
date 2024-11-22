package pavanSDET_QA;

//https://www.youtube.com/watch?v=Uywn0YzX8OQ&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=17
public class Java17FindMissingNumberInAnArray {

	public static void main(String[] args) {
		// Array should not have duplicates
		// Array no need to be sorted order
		// Values should be in range

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of elements in array:" + sum1);
		int sum2 = 0;
		for (int i = 1; i <= a.length + 1; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("Sum of elements in array:" + sum2);
		int missing = sum2 - sum1;
		System.out.println("Missing number is: " + missing);
	}

}
