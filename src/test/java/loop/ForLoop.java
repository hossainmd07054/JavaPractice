package loop;

public class ForLoop {

	public static void main(String[] args) {
		for(int i =0; i<10; i++) {
			System.out.println(i);			
		}
		int [] arr = {5,10,15,20,25};
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(int j =arr.length-1; j>=0; j--) {
			System.out.println(arr[j]);
		}
	}

}
