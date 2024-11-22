package javaPractice;

import org.testng.annotations.Test;

abstract class ClassA {
	int x;

	void fun1() {
		System.out.println("Non abstract method");
	}
	abstract void fun2();

}
@Test
public class AbstractA extends ClassA{

	public static void main(String[] args) {
		AbstractA ca = new AbstractA();
		ca.fun1();
		ca.fun2();
	}

	@Override
	void fun2() {
		System.out.println("An abstract method");
	}

}
