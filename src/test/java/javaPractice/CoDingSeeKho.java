package javaPractice;

public class CoDingSeeKho {

//	static void fun1() {
//		System.out.println("A");
//	}
//	static void fun2() {
//		System.out.println("B");
//	}
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		a1.fun1();
		a2.fun2();
		
//		System.out.println("C");
//		CoDingSeeKho.fun1();
//		CoDingSeeKho.fun2();
//		Area.fun1();
//		Area.fun2();
//	}
//}
//class Area {
//	int x;
//	int y;  
//	static void fun1() {
//		System.out.println("Area 1");
//	}
//	static void fun2() {
//		System.out.println("Area 2");
	}
}
	class A {
		private int x;
		private static int y;
		
		void fun1() {
			y =22;
			x =5;
		}
		void fun2() {
			System.out.println(x);
		}
		void fun3() {
			y=45;
		}		
	}

