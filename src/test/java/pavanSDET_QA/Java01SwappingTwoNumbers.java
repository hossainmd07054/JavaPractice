package pavanSDET_QA;

import org.testng.annotations.Test;

//https://www.youtube.com/watch?v=3vbizK6KzaU&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa
public class Java01SwappingTwoNumbers {
	@Test(priority = 1)
	public void usingTemp() {
		System.out.println("priority 3 ");
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("Before swapping " + a + " " + b);
		temp = a;// 10
		a = b;// 20
		b = temp;
		System.out.println("After swapping " + a + " " + b);
	}

	@Test(priority = 2)
	public void usingSingleStatement() {
		System.out.println("priority 4 ");
		int a = 10;
		int b = 20;
		System.out.println("Before swapping " + a + " " + b);
		b = a + b - (a = b);
		System.out.println("After swapping " + a + " " + b);
	}

	@Test(priority = 3)
	public void usingAdditionAndSubtraction() {
		System.out.println("priority 1 ");
		int a = 10;
		int b = 20;
		System.out.println("Before swapping " + a + " " + b);
		a = a + b;// 10+20=30
		b = a - b;// 30-10=20
		a = a - b;// 30-20=10
		System.out.println("After swapping " + a + " " + b);
	}

	@Test(priority = 4)
	public void usingMultiplicationAndDivision() {// a & b valets should not be Zero
		System.out.println("priority 2 ");
		int a = 10;
		int b = 20;
		System.out.println("Before swapping " + a + " " + b);
		a = a * b;// 10*20=200
		b = a / b;// 200/10=20
		a = a / b;// 200/20=10
		System.out.println("After swapping " + a + " " + b);
	}

	@Test(priority = 5)
	public void usingBitwiseXOR() {
		System.out.println("priority 5 ");
		int a = 10;
		int b = 20;
		System.out.println("Before swapping " + a + " " + b);
		a = a ^ b;// 10*20=200
		b = a ^ b;// 200/10=20
		a = a ^ b;// 200/20=10
		System.out.println("After swapping " + a + " " + b);
	}

	@Test(priority = 6)
	public void test8() {
		int a = 10;
		int b = 20;
		int temp = a;
		System.out.println(a + "\n" + b);
		a = b;// 20
		b = temp;
		System.out.println(a + "\n" + b);
	}
}
