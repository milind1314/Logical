/*
 Copy Elements Skipping Every Second Element
 Write a program to copy the elements of an array {1, 2, 3, 4, 5, 6}
 into a new array, skipping every second element. 
 The resulting array should be {1, 3, 5}.
 */
package copyArray;

import java.util.Arrays;

public class CopyElementsSkippingEverySecondElement {

	public static void copyArray(int[] arr) {
		int count = 0;
		int index = 0;
		for (int i : arr) {

			if (i % 2 != 0) {
				count++;
			}

		}

		int[] skipping = new int[count];

		for (int i : arr) {

			if (i % 2 != 0) {
				skipping[index] = i;
				index++;
			}
		}
		System.out.println("Skipping element array : " + Arrays.toString(skipping));

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Orignal Array : " + Arrays.toString(arr1));
		copyArray(arr1);
	}

}
