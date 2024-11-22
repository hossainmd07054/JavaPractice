package javaPractice;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		int[] a = {5, 10, 20, 10, 20, 5, 8, 6, 7, 6,50,100,30 };
		Arrays.sort(a);
		System.out.println("After Sorting:"+Arrays.toString(a));
        System.out.print("After removing duplicates: ");
        //5,5,6,
        int b = 0;
        a[b] = a[0];
        for(int i=0; i<a.length; i++){
            if (a[b] != a[i]){
                b++;
                a[b] = a[i];
            }
        }
        for (int i=0; i<=b; i++ ){
            System.out.print(a[i]+"\t");
        }
    }
}
////		int b = 0;
////		a[b] = a[0];
//		//After Sorting:[5, 5, 6, 6, 7, 10, 10, 20, 20]
//		for (int i = 0; i < a.length; i++) {
////			System.out.print(a[i]+" ");
//			for (int j = 1; j < a.length; j++) {
//				if(a[i] != a[j]){
//					
//					System.out.print(a[j]+" ");
//				}
//				
//			}
//			if (a[b] != a[i]) {
//				b++;
//				a[b] = a[i];
//			}
//		}
//
////		System.out.print("Before Sorting:");
////		for (int i = 0; i < a.length; i++) {
////			System.out.print(a[i] + "\t");
////		}
////		System.out.print("\nAfter Sorting:");
////		// sorting the elements
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 1; j < a.length; j++) {
//				if (a[i] > a[j]) {
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//					System.out.println(a[j] + "\t");
//				}
//			}
//		}
////		// After sorting
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + "\t");
//		}
//		System.out.print("\nAfter removing duplicates:");
//		int b = 0;
//		a[b] = a[0];
//		for (int i = 0; i < a.length; i++) {
//			if (a[b] != a[i]) {
//				b++;
//				a[b] = a[i];
//			}
//		}
//		for (int i = 0; i <= b; i++) {
//			System.out.print(a[i] + "\t");
//		}
//		int[] a = { 5, 10, 20, 10, 20, 5, 6, 7, 6 };
////		int temp = 0;
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//			for(int j=1; j<a.length;j++){
//				if(a[i]>a[j]){
//					int temp = a[i];//5
//					a[i]= a[j];//10
//					a[j]=temp;
//					
//					System.out.print(a[j]);
//				}
//				
//			}
//			
//		}
	
	
//	int[] numbers = {5, 2, 8, 1, 9};

    // Sort the array in ascending order
//    Arrays.sort(a);
//
//    // Print the sorted array
//    System.out.println(Arrays.toString(a));
//}

