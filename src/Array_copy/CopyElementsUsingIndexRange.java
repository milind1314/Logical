/*
 Copy Elements Using Index Range
 Write a program to copy elements from index 2 to 4 of the array
 {10, 20, 30, 40, 50, 60} into a new array. The resulting array 
 should be {30, 40, 50}.
 */package copyArray;

import java.util.Arrays;
import java.util.Scanner;

public class CopyElementsUsingIndexRange {
	public static Scanner in = new Scanner(System.in);
	public static void copyArray(int[] orignal, int start, int end) {
		int size = end - start;
		int index = 0;
		int[] copy = new int[size+1];
		
		for (int i = start; i <= end; i++) {
			copy[index] = orignal[i];
			index++;
		}
		System.out.println("Orignal array : "+Arrays.toString(orignal));
		System.out.println("Copy array : "+Arrays.toString(copy));
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter starting index to copy from above array : ");
		int startIdx = in.nextInt();
		System.out.print("Enter ending index to copy from above array : ");
		int endIdx = in.nextInt();
		
		
		copyArray(arr, startIdx, endIdx);
	}

}
