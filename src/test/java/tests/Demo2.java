package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void sampleOne() {
		System.out.println("sampleOne got executed");
	}

	@Test
	public void sampleTwo() {
		System.out.println("sampleTwo got executed");
		Assert.fail("Intentionally failing the test");
	}

	@Test
	public void sampleThree() {
		System.out.println("sampleThree got executed");
	}

}
