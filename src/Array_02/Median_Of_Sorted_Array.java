/*
Question 20:
Find the median of a sorted array.
    Test Case: 1
  ----------------
   Array size: 6
   Elements are: 1, 2, 3, 4, 5, 6
   Median is: 3.5
  Test Case: 2
  ----------------
   Array size: 5
   Elements are: 1, 2, 3, 4, 5
   Median is: 3
*/
package Array_02;
import java.util.Scanner;

public class Median_Of_Sorted_Array {
	public static int[] ceateArray() {
		System.out.print("Enter array size : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter array elemets : ");
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		sc.close();
		return arr;
	}

	public static void displayArr(int arr[]) {
		System.out.println("Array elements are : ");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

	public static double median(int[] arr) {
		if (arr.length % 2 == 1)
			return arr[arr.length / 2];
		else
			return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
	}

	public static void main(String[] args) {
		int arr[] = ceateArray();
		displayArr(arr);
		System.out.println("Median : " + median(arr));
	}
}