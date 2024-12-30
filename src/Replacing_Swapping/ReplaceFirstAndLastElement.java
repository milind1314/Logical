/*
 Write a program to swap the 1st and last elements of the 
 array {1, 2, 3, 4, 5}.
 Example: Resulting array should be {5, 2, 3, 4, 1}
 */
package replacing_swapping;

import java.util.Arrays;

public class ReplaceFirstAndLastElement {

	public static void swapFirstAndLast(int[] arr) {
		if (arr.length == 0) {
			System.out.println("Array is empty");
			return;
		}

		int temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;

		System.out.println("Updated Array : "+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Orignal Array : "+Arrays.toString(arr));
		swapFirstAndLast(arr);
	}

}
