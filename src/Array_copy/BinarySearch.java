/*
 Write java method named binarySearch() that recieves an int num and an array,
 it searches the given elements is present or not by using binary search algorithm in the given array and if the element is present
 then it returns the index number or if the element not found then it returns -1.
 */
package copyArray;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static Scanner sc = new Scanner(System.in);

	public static int binarySearch(int[] arr, int target) {
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else
				return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 32, 53, 12, 15, 75 };
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter a element you want to find index of : ");
		int index = sc.nextInt();
		if (binarySearch(arr, index) != -1) {
			System.out.println("Element " + index + " found at index : " + binarySearch(arr, index));
		} else {
			System.out.println("No element found!");
		}
	}
}