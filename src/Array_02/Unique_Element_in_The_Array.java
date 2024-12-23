/*
 Count and Print Distinct Elements.
 Write a program to count the number of distinct/unique/non repeated
 elements in an array {1, 2, 2, 3, 4, 4, 5} and print those unique
 */
package Array_02;

public class Unique_Element_in_The_Array {

	public static void main(String[] args) {
		
		int[] arr ={1, 2, 2, 3, 4, 4, 5};

		int size = arr.length;
		
		System.out.print("Unique Elements in array is : ");
		for (int i = 0; i < size; i++) {

			int count = 0;
			for (int j = 0; j < size; j++) {

				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
