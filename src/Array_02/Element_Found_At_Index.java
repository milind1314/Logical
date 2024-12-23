
/*
 Search for a given Element in an Array if present then print
   "Element found at index : ", if not present print "Element not found"
    Input as: 1 4 3 5 2 6 5
    Enter searching element: 5
    Output: Element found at index 6
 
     Input as: 1 4 3 5 2 6
    Enter searching element: 7
    Output: Element not found 
 */
package Array_02;

import java.util.Scanner;

public class Element_Found_At_Index {

	public static Scanner sc = new Scanner(System.in);

	public static void findElement(int[] arr) {
		System.out.print("Element found at index  : ");
		int k = sc.nextInt(); 
		int size = arr.length; 
		boolean found = false; 
		for (int i = 0; i < size; i++) 
		{ 
			if (arr[i] == k) 
			{ 
				System.out.println("Element found at index: " + i); 
				found = true; 
				
			}
			
		}
		if (!found) {
			System.out.println("Element not found.");
		}
		
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 3, 5, 2, 6, 5 };
		findElement(arr1);

	}

}
