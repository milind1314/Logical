/*
 Write java method named findEvenandOddPositionElement that print
 all the elements which is present at even index and also in odd index. 
 */
package Array_02;

import java.util.Scanner;

public class Even_And_Odd_Index_Position {

	public static Scanner in = new Scanner(System.in);

	public static void findEvenandOddPositionElement(int[] arr) {
		System.out.print("Even Indexes are : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print( "["+i+"]:"+arr[i]+" ");
			}
		}
		System.out.println();
		System.out.print("Odd Indexes are : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print( "["+i+"]:"+arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {

		System.out.print("Enter Size of array : ");
		int size = in.nextInt();
		
		int[] arr = new int[size];
		System.out.print("Enter "+size+" element in an array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		findEvenandOddPositionElement(arr);
	}

}
