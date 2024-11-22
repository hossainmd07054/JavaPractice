package pavanSDET_QA;

//https://www.youtube.com/watch?v=Ns4LoG56SZ4&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=7
public class Java07CountNumberOfEvenAndOddDigitsInANumber {

	public static void main(String[] args) {

		int num = 12345678;
		int even_count = 0;
		int odd_count = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				even_count++;

			} else {
				odd_count++;
			}
			num = num / 10;
		}
		System.out.println("Number of Even numbers " + even_count);
		System.out.println("Number of Odd numbers " + odd_count);
	}

}
