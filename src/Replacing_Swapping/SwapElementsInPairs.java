/*
 Swap Elements in Pairs
 Write a program to swap elements of the array {1, 2, 3, 4, 5} 
 in pairs. 
 If the array has an odd length, leave the last element as is.
 Example: Resulting array should be {2, 1, 4, 3, 5}.
 */
package replacing_swapping;

import java.util.Arrays;

public class SwapElementsInPairs {

	public static void pairElement(int[] arr) {
		if (arr.length == 0) {
			System.out.println("Array is empty");
			return;
		}
		for (int i = 0; i < arr.length-1; i++) {
			if (i % 2 == 0) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		System.out.println("Updated Array : "+Arrays.toString(arr));
	
	}
	
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Orignal Array : "+Arrays.toString(arr));
		pairElement(arr);
	}

}
