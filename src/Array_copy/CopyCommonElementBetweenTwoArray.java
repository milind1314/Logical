package copyArray;

import java.util.Arrays;

public class CopyCommonElementBetweenTwoArray {
	
	public static void copyArray(int[] arr1, int[] arr2) {
		int count = 0;
		int index = 0;
		for (int i : arr1) {
			for (int j : arr2) {
				if (i == j) {
					count++;
				}
			}
		}
		
		int[] common = new int[count];
		
		for (int i : arr1) {
			for (int j : arr2) {
				if (i == j) {
					common[index] = i;
					index++;
				}
			}
		}
		System.out.println("Common element array : "+Arrays.toString(common));	
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] arr2 = {1, 3, 5, 6, 7, 9, 11, 12};
		
		System.out.println("Array 1 : "+Arrays.toString(arr1));
		System.out.println("Array 2 : "+Arrays.toString(arr2));
		copyArray(arr1, arr2);
	}

}
