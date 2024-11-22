package pavanSDET_QA;

//https://www.youtube.com/watch?v=vwjhT_OTp1w&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=11
public class Java11CheckGivenNumberIsPrimeOrNot {

	public static void main(String[] args) {
		int num = 21;
		int count = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not Prime Number");
			}
		} else {
			System.out.println("Not Prime Number");
		}

	}

}
