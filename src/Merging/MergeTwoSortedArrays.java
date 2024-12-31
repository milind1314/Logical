/*
 Merge Two Sorted Arrays.

 Write a program to merge two sorted arrays {1, 3, 5} 
 and {2, 4, 6} into a single sorted array.
 Example: Resulting array should be {1, 2, 3, 4, 5, 6}.
 */
package merging;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	public static void mergeArrays(int[] arr1, int[] arr2) 
	{
		int idx = 0;
		int[] mergeArr = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			mergeArr[idx++] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			mergeArr[idx++] = arr2[i];
		}
		Arrays.sort(mergeArr);
		System.out.println("Merge Array : "+Arrays.toString(mergeArr));
	}
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5};
		int[] arr2 = {2, 4, 6};
		System.out.println("Orignal Array 1 : " + Arrays.toString(arr1));
		System.out.println("Orignal Array 2 : " + Arrays.toString(arr2));
		mergeArrays(arr1, arr2);

	}

}
