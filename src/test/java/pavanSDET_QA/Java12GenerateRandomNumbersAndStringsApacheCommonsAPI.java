package pavanSDET_QA;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

//https://www.youtube.com/watch?v=PXtJtJZdsbU&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=12
public class Java12GenerateRandomNumbersAndStringsApacheCommonsAPI {
	@Test(priority = 1)
	public void randomInteger() {
		Random rm = new Random();
		int rand = rm.nextInt(1000);
		System.out.println(rand);
	}

	@Test(priority = 2)
	public void randomDouble() {
		Random rm = new Random();
		double rand = rm.nextDouble();
		System.out.println(rand);
	}

	@Test(priority = 3)
	public void randomDoubleUsingMath() {
		double rand = Math.random();
		System.out.println(rand);
	}

	// https://commons.apache.org/proper/commons-lang/download_lang.cgi
	@Test(priority = 4)
	public void randomApacheCommonsAPI() {
		String rand = RandomStringUtils.randomNumeric(10);
		System.out.println(rand);
	}

	@Test(priority = 5)
	public void randomString() {
		String rand = RandomStringUtils.randomAlphabetic(10);
		System.out.println(rand);
	}

}
