package javaPractice;

class Exam {
	void fun1() {
		System.out.println("A");
	}

	void f1() {
		int a = 20;
		System.out.println(a);
	}
}

class Example extends Exam {
	void fun1(int p) {
		System.out.println("B");
	}
	void f1() {
		int a = 10;
		System.out.println(a);
	}

}

public class FunOverLR {

	public static void main(String[] args) {
		Example ex = new Example();
		ex.fun1();
		ex.fun1(4);
		ex.f1();
	}

}
