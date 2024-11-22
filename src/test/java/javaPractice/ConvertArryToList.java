package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertArryToList {

	public static void main(String[] args) {
		//Creating Array  
		String[] array={"Java","Python","Python","PHP","C++"};  
		System.out.println("Printing Array: "+Arrays.toString(array));  
		//Converting Array to List  
		List<String> list=new ArrayList<String>();  
		for(String lang:array){  
		list.add(lang);  
		}  
		System.out.println("Printing List: "+list); 

		// Creating Array
		int arr[] = { 5, 10, 20, 30, 10, 20, 10, 50, 10, 5, 8, 6, 6, 6, 6, 6, 10, 4, 1, 3, 100, 5, 100, 100 };

//		String[] array = { "Java", "Python", "Python", "PHP", "C++" };
		System.out.println("Printing Array: " + Arrays.toString(arr));
		// Converting Array to List
		Set<Integer> set = new HashSet<Integer>();
//		list.add(5);
		for (Integer lang : arr) {
			set.add(lang);
		}
		System.out.println("Printing List: " + set);

	}

}
