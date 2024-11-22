package javaPractice;

public class DemoClass1 {

	public static void main(String[] args) {
		DemoClass1 dc1 =new DemoClass1();
		dc1.getData();
//		DemoClass2 dc2 = new DemoClass2();
		System.out.println(DemoClass1.getData2());
		System.out.println(DemoClass2.getData2());
		DemoClass1.getData3();
	}
	
	
	
	
	public void getData() {
		System.out.println("getData");
	}
	public static String getData2() {
		System.out.println("getData2");
		return "Hello World2";
	}
	public static void getData3() {
		System.out.println("getData3");
	}

}
