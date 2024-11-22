package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInAnArray {

	public static void main(String[] args) {
		int arr[] = { 5, 10, 20, 30, 10, 20, 10, 50, 10, 5, 8, 6, 6, 6, 6, 6, 10, 4, 1, 3, 100, 5, 100, 100 };
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		System.out.print("\n");
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					i++;
//					System.out.println("Found Duplicate Elements: " + arr[i] + " ");
					flag = true;
				}
			}
		}
		if (flag == false) {
//			System.out.println("Duplicate Elements Not Found");
		}

// ***************************************************************************************************
//		String arr1[] = { "Java", "C", "C++", "python", "Java", "Java", "Java", "C", "C++", "python", "Java", "Java" };
//		Arrays.sort(arr1);
//		System.out.print(Arrays.toString(arr1));
//		System.out.print("\n");
//		boolean flag1 = false;
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = i + 1; j < arr1.length; j++) {
//				if (arr1[i] == arr1[j]) {
//					System.out.println("Found Duplicate Elements: " + arr1[i] + " ");
//					i++;
//					flag1 = true;
//				}
//			}
//		}
//		if (flag1 == false) {
//			System.out.println("Duplicate Elements Not Found");
//		}

//***************************************************************************************************
//		int arr[] = { 5, 10, 20, 30, 10, 20, 10, 50, 10, 5, 8, 6, 6, 6, 6, 6, 10, 4, 1, 3, 100, 5, 100, 100 };
//		Arrays.sort(number);
//		System.out.println(Arrays.toString(number));
//		System.out.println("\n");
//		boolean flag =false;
//		//[1, 3, 4, 5, 5, 5, 6, 8, 10, 10, 10, 20, 20, 30, 50, 100, 100]
//		HashSet<Integer> has = new HashSet<Integer>();
//		for(int l:number) {			
//				if(has.add(l)== false) {
//					System.out.println("Found Duplicate Elements: "+l+" ");
//					flag =true;
//				}
//			}		
//		if(flag == false) {
//			System.out.println("Duplicate Elements Not Found");
//		}

//-------------------------------------------------------------------------------
//		int[] array = {1, 2, 3, 2, 4, 5, 1, 6,1, 2, 3, 2, 4, 5, 1, 6};
//
//        List<Integer> duplicates = findDuplicates(array);
//
//        System.out.println("Duplicate elements: " + duplicates);
//    }
//
//    public static List<Integer> findDuplicates(int[] array) {
//        List<Integer> duplicates = new ArrayList<>();
//        Set<Integer> seen = new HashSet<>();
//
//        for (int num : array) {
//            if (!seen.add(num)) {
//                duplicates.add(num);
//            }
//        }
//        return duplicates;

	}

}
