package javaPractice;

public class Wrap {

	public static void main(String[] args) {
		//https://www.youtube.com/watch?v=3vbizK6KzaU&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa
		Integer i1=Integer.valueOf("1000111",2);
//		System.out.println(i1);
		int x=i1.intValue();
		System.out.println(x);
		
		Double i2 = Double.valueOf("123");
//		System.out.println(i2);
		Double y=i2.doubleValue();
		System.out.println(y);
		
		Integer i3=Integer.parseInt("1000ABC",16);
//		System.out.println(i3);
		Integer z=i3.intValue();
		System.out.println(z);
		

	}

}
