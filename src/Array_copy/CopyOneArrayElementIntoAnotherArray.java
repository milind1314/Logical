/*
 Copy Array to Another Array
 Write a program to copy all the elements of one array {1, 2, 3, 4, 5} 
 into another array and print the new array.
 */
package copyArray;

import java.util.Arrays;

public class CopyOneArrayElementIntoAnotherArray {

	public static void copyArray(int[] orignal) {
		int[] copy = new int[orignal.length];
		for (int i = 0; i < orignal.length; i++) {
			copy[i] = orignal[i]; 
		}
		System.out.println(Arrays.toString(copy));
	}
	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		copyArray(arr);
	}

}
