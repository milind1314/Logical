/*
 *  Count Elements Appearing Exactly k Times.

 Write a program to count how many elements appear exactly 2 times
 in an array {1, 2, 2, 3, 4, 4, 5, 5}.
 Example: 2, 4, and 5 each appear exactly twice.
 If k time elements are not found then print "No element found".
 */

package Array_02;

import java.util.Scanner;

public class Element_Appear_In_The_Array {

	public static void elementAppear(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a count to check elements that appear exactly that many times : ");
		int k = sc.nextInt();
		int size = arr.length;
		boolean found = false;
		for (int i = 0; i < size; i++) {

			int count = 0;
			for (int j = i; j < size; j++) {

				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == k) {
				System.out.print(arr[i] + " ");
				found = true;
			}
		}
		if (!found) {
			System.out.println("No majority element.");
		}
		sc.close();
	}
	public static void main(String[] args) {

		int[] array = {1, 2, 2, 3, 4, 4, 5, 5};
		elementAppear(array);
		
	}

}
