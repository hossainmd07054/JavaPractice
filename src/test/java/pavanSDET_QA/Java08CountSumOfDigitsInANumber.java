package pavanSDET_QA;

//https://www.youtube.com/watch?v=ZLaBlxnmrxc&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=8
public class Java08CountSumOfDigitsInANumber {

	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;

		}
		System.out.println("Sum of digits in s number " + sum);
	}

}
