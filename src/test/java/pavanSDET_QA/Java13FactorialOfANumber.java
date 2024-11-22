package pavanSDET_QA;

import org.testng.annotations.Test;

//https://www.youtube.com/watch?v=0VoHk8a6F6E&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=13
public class Java13FactorialOfANumber {
	@Test(priority = 1)
	public void factorialOfANumberAssending() {
		// 5!=1*2*3*4*5*6=120
		int num = 6;
		long factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of a Number is: " + factorial);
	}

	@Test(priority = 2)
	public void factorialOfANumberDssending() {
		// 5!=6*5*4*3*2*1=120
		int num = 6;
		long factorial = 1;
		for (int i = num; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of a Number is: " + factorial);
	}

}
