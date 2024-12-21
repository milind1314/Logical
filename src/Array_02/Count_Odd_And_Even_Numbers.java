/*
 Count Odd and Even Numbers
 Given an array {1, 2, 3, 4, 5, 6}, write a program to count how many
 elements are odd and how many are even.
*/


package Array_02;

public class Count_Odd_And_Even_Numbers {
	public static void countEvenAndOdd(int[] arr) {
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		
		System.out.println("The Even count in given array is : "+evenCount);
		System.out.println("The Odd count in given array is : "+oddCount);
	}

	public static void main(String[] args) {

		int[] arr= {1, 2, 3, 4, 5, 6};
		
		countEvenAndOdd(arr);
	}

}
