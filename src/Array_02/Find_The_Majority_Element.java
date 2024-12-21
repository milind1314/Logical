/*
 Find the Majority element.
 Print the Element which appeared More than n/2 Times.
 [n is length of the array]
 
 Write a program to find an element in an array
 {3, 3, 4, 2, 4, 4, 2, 4, 4}
 that appears more than n/2 times. If no such element exists,
 display "No majority element."
 */
package Array_02;

public class Find_The_Majority_Element {

	public static void majorityElement(int[] arr) {
		int size = arr.length;
		double middle = (double) size / 2;

		for (int i = 0; i < size; i++) {

			int count = 1;
			for (int j = 1; j < size; j++) {

				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > middle) {
				System.out.println("Majority element is : " + arr[i]);
				System.exit(count);
			}
		}
		System.out.println("No majority element.");
	}

	public static void main(String[] args) {

		int[] arr1 = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
		majorityElement(arr1);
	}

}
