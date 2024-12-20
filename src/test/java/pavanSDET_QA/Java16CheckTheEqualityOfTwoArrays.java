package pavanSDET_QA;

import java.util.Arrays;

import org.testng.annotations.Test;

//https://www.youtube.com/watch?v=dCr67d0QBCA&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=16
public class Java16CheckTheEqualityOfTwoArrays {
	@Test
	public void checkTheEqualityOfTwoArraysUsingEqualsMethod() {
		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = { 1, 2, 3, 4, 5 };
		boolean status = Arrays.equals(a1, a2);
		if (status == true) {
			System.out.println("Arrays are Equal");
		} else
			System.out.println("Arrays are Not Equal");
	}

	@Test
	public void checkTheEqualityOfTwoArraysUsingLogic() {
		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = { 1, 2, 3, 4, 5 };
		boolean status = true;
		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) {
					status = false;
				}
			}
		} else {
			status = false;
		}
		if (status == true) {
			System.out.println("Arrays are Equal");
		} else {
			System.out.println("Arrays are Not Equal");
		}
	}
}
