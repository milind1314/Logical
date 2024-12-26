/*
 Copy Odd and Even Numbers Separately
 Write a program to copy the even numbers and odd numbers from 
 the array {1, 2, 3, 4, 5, 6} into new arrays and print the resulting array.
 */
package copyArray;

import java.util.Arrays;

public class CopyEvenAndOddElementDInDifferentArray {

	public static void copyArray(int[] orignal) {
		int evenCount = 0, oddCount = 0;
		for (int i : orignal) {
			if (i % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		int[] even = new int[evenCount];
		int[] odd = new int[oddCount];
		int idxEven = 0, idxOdd = 0;

		for (int i : orignal) {
			if (i % 2 == 0) {
				even[idxEven] = i;
				idxEven++;
			} else {
				odd[idxOdd] = i;
				idxOdd++;
			}
		}
		System.out.println("Even Array : "+Arrays.toString(even));
		System.out.println("Odd Array : "+Arrays.toString(odd));
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		copyArray(arr);

	}

}
