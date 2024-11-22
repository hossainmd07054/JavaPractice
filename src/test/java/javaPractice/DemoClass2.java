package javaPractice;

import java.util.Iterator;

public class DemoClass2 {
	public static void main(String[] args) {
		
		String [] name2 = {"MOHAMMAD","HOSSAIN"};
		
		System.out.println(name2.length);
		for(int i =0; i<name2.length; i++) {
			System.out.println(name2[i]);
		}
		for(int j=name2.length-1; j>=0; j--) {
			System.out.println(name2[j]);
		}
		String name = "Mohammad Hossain";
		
		for(int i=0; i<name.length();i++) {
			System.out.print(name.charAt(i));
		}
		System.err.println(" ");
		
		for(int i=name.length()-1; i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		
	}
	
	public static String getData2() {
		System.out.println("DemoClass2");
		return "DemoClass2";
	}

}
