/*
 Count Elements Greater than Average.
 Write a program to count how many elements in the array
 {10, 20, 30, 40, 50}
 are greater than the average of all the elements.

*/

package Array_02;

public class Count_Elements_Greater_Than_Average {

	public static void countGreaterThanAverage(int[] arr) {
		int size = arr.length;
		int sum = 0;
		int count = 0;
		
		for (int i : arr) {
			sum += i; 
		}
		
		double avg = (double) sum / size;
		
		for (int j : arr) {
			if (j > avg) {
				count++;
			}
		}
		
		System.out.println("The average of all array element is : "+avg);
		System.out.println("The count elements greater than average : "+count);
	}
	
	public static void main(String[] args) {

		int[] arr1 = {10, 20, 30, 40, 50};
		
		countGreaterThanAverage(arr1);
	}
}
