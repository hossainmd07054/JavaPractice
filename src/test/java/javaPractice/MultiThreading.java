package javaPractice;

class Process1 extends Thread {
//	void fun1() {
//		int i;
//		for (i = 1; i <= 10; i++) {
//			System.out.println(i + " Process1");
//
//		}
//	}

	@Override
	public void run() {
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println("p1: "+i);

		}
	}
}

class Process2 extends Thread {
//	void run1() {
//		int i;
//		for (i = 1; i <= 10; i++) {
//			System.out.println(i + " Process2");
//
//		}
//	}

	@Override
	public void run() {
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println("P2: "+i);

		}
	}
}

public class MultiThreading {

	public static void main(String[] args) {
		Process1 p1 = new Process1();
//		p1.fun1();
		Process2 p2 = new Process2();
//		p2.run1();
//		Thread t1 = new Thread(p1);
//		Thread t2 = new Thread(p2);
		p1.start();
		p2.start();
	}

}
