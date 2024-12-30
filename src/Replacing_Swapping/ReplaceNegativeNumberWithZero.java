/*
 Replace Negative Numbers with Zero.

 Write a program to replace all negative numbers in the array 
 {1, -2, 3, -4, 5} with 0.
 Example: Resulting array should be {1, 0, 3, 0, 5}.
*/

package replacing_swapping;

import java.util.Arrays;

public class ReplaceNegativeNumberWithZero {

	public static void replaceNegative(int[] arr) 
	{
		System.out.println("Orignal Array : "+Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) 
			{
				arr[i] = 0;
			}
		}
		System.out.println("Updated Array : "+Arrays.toString(arr));
		
	}
	public static void main(String[] args) 
	{
		int[] arr = {1, -2, 3, -4, 5};
		replaceNegative(arr);
	}

}
