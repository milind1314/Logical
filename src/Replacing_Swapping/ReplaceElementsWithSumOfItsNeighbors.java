/*
 Replace Elements with the Sum of Neighbors
 Write a program to replace each element in an array
 {1, 2, 3, 4, 5} 
 with the sum of its neighbors.
 Example: Resulting array should be {2, 4, 6, 8, 4}.
 */
package replacing_swapping;

import java.util.Arrays;

public class ReplaceElementsWithSumOfItsNeighbors {

	public static void SumOfItsNeighbors(int[] arr) {
		if (arr.length == 0) 
		{
			System.out.println("Array is empty");
			return;
		}
		
		int[] newArr = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (i == 0) 
			{
				newArr[i] = arr[i + 1];
			}
			else if (i == arr.length-1) 
			{
				newArr[i] = arr[i - 1];
			}
			else 
			{
				newArr[i] = arr[i - 1] + arr[i + 1];
			}
		}
		System.out.println(Arrays.toString(newArr));
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		SumOfItsNeighbors(arr);
	}

}
