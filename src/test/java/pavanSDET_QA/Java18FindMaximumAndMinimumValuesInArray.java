package pavanSDET_QA;

//https://www.youtube.com/watch?v=Jrr0bNcPFgo&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=18
public class Java18FindMaximumAndMinimumValuesInArray {

	public static void main(String[] args) {
		int a[] = { 101, 100, 50, 80, 5, 30, 40, 20, 60, 10, 1 };
		int max = a[0];
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else {
				min = a[i];
			}
		}
		System.out.println("Maximum number is: " + max);
		System.out.println("Minimum number is: " + min);
	}

}
