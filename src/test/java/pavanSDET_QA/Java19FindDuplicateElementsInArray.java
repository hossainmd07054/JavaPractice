package pavanSDET_QA;

import java.util.Arrays;
import java.util.HashSet;

import org.testng.annotations.Test;

//https://www.youtube.com/watch?v=X_NfqtyG4Bs&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=19
public class Java19FindDuplicateElementsInArray {
	@Test
	public void findDuplicateElementsInArrayUsingLogic() {
		String arr[] = { "Java", "C", "C++", "python", "Java", "Java", "Java", "C", "C++", "python", "Java", "Java" };
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		System.out.print("\n");
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Found Duplicate Elements: " + arr[i] + " ");
					i++;
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("Duplicate Elements Not Found");
		}
	}

	@Test
	public void findDuplicateElementsInArrayUsingHashSet() {
		String arr[] = { "Java", "C", "C++", "python", "Java", "Java", "Java", "C", "C++", "python", "Java", "Java" };
//		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		System.out.print("\n");
		boolean flag = false;
		HashSet<String> langs = new HashSet<String>();
		for (String l : arr) {
			if (langs.add(l) == false) {
				System.out.println("Found Duplicate Elements: " + l);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("Duplicate Elements Not Found");
		}

	}
}
