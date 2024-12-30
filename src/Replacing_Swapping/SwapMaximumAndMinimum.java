/*
 Swap Maximum and Minimum Elements
 Write a program to swap the maximum and minimum elements in an array 
 {3, 1, 4, 5, 2}.
 Example: Resulting array should be {3, 5, 4, 1, 2}.
 */
package replacing_swapping;

import java.util.Arrays;

public class SwapMaximumAndMinimum {

	public static void swapMaxAndMin(int[] arr) 
	{
		if (arr.length == 0) {
			System.out.println("Array is empty");
			return;
		}
		
		int max = Integer.MIN_VALUE, maxidx = 0;
		int min = Integer.MAX_VALUE, minidx = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] > max) 
			{
				max = arr[i];
				maxidx = i; 
			} 
			else if (arr[i] < min) 
			{
				min = arr[i];
				minidx = i;
			}
		}
		
		//swap minimum and maximum elements
		
		int temp = arr[maxidx];
		arr[maxidx] = arr[minidx];
		arr[minidx] = temp;
		
		System.out.println("Minimum Element : "+min);
		System.out.println("Maxmum Element : "+max);
		System.out.println("Updated Array : " + Arrays.toString(arr));

	}

	public static void main(String[] args) {

		int[] arr = { 3, 1, 4, 5, 2 };
		System.out.println("Orignal Array : " + Arrays.toString(arr));
		swapMaxAndMin(arr);

	}

}
