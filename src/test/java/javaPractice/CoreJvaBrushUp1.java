package javaPractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJvaBrushUp1 {

	public static void main(String[] args) {
		int myNum = 5;
		String name = "Mohammad Shakhayaat Hossain";
		char letter = 'r';
		double dec = 5.99;
		boolean nyCart = true;
		System.out.println(myNum);
		System.out.println(name);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(nyCart);
		int [] arr = new int[5];
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 32;
		arr[3] = 44;
		arr[4] = 55;
		int []arr5 = {5,15,25,35,45,55,65};

		for(int i = 0; i<arr5.length; i++) {
			System.out.print(arr5[i]+" ");
		}
		for(int i = arr5.length-1; i>=0; i--) {
			System.out.println(arr5[i]);
		}
		for(int num:arr5) {
			System.out.println(num);
		}
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%5 == 0) {
				System.out.println(arr[i]);
			}
			else {
				System.out.println("Sorry");
			}			
		}
		String [] name1 = {"Mohammad","Shakhayat","Hossain"};

		System.out.println(name1[1]);

		for(int i = 0; i<name1.length;i++) {
			System.out.println(name1[i]);			
		}

		for(int i = name1.length-1; i>=0;i--) {
			System.out.println(name1[i]);			
		}		
		String name2 = "Mohammad Shakhayat Hossain";
		for(int i = 0; i<name2.length(); i++) {
			System.out.print(name2.charAt(i));			
		}
		System.out.println("");

		for(int i = name2.length()-1; i>=0;i--) {
			System.out.print(name2.charAt(i));			
		}
		int a =5;
		int b =10;
		int temp;
		System.out.println(a);
		System.out.println(b);

		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
		int x = 0, y = 1, c = 10,next;

		for(int i=0; i<=c; i++) {
			System.out.println(a);
			next = x + y;
			x = y;
			y = next;
		}
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Hossain");
		arr2.add("Mohammad");
		arr2.add("Shakhayat");
		System.out.println(arr2.get(1));
		for(int i=0;i<arr2.size();i++) {
			System.out.println(arr2.get(i));
		}
		System.out.println(arr2.contains("Mohammad"));

		arr2.remove(0);
		for(int i=0;i<arr2.size();i++) {
			System.out.println(arr2.get(i));
		}
		String [] name3 = {"Mohammad","Shakhayat","Hossain"};

		List<String> name4 = Arrays.asList(name3);

		System.out.println(name4.contains("Shakhayat"));
		System.out.println(name4.size());

		String name5 = "Mohammad Shakhayat Hossain";
		System.out.println(name5.startsWith("Mohammad Shakhayat Hossai"));
		for(int i=0; i<name5.length(); i++) {
			System.out.println(name5.charAt(i));
		}
		String []names = name.split(" ");
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println(name.toUpperCase());
		System.out.println(names[0].toUpperCase());
		System.out.println(names[1].toLowerCase());
		System.out.println(names[2].indexOf("H"));



	}

}
