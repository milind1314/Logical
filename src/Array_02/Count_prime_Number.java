/* 
 Write a program to count how many elements in an array
 {2, 3, 4, 5, 6, 7, 8, 9, 10} are prime numbers.
 Example: 2, 3, 5, and 7 are prime.
 */

package Array_02;

public class Count_prime_Number {

	public static void primeCount(int[] arr) {
		int size = arr.length;
		System.out.print("Prime element in the array are : ");
		for (int i = 0; i < size; i++) {

			int count = 0;
			for (int j = 1; j <= size; j++) {

				if (arr[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {

		int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		primeCount(arr);
	}

}
