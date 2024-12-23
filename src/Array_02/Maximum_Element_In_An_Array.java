/*
 Find Maximum Element in an Array.
 Input as: 6 3 2 1 5 5 4
 Output as: Max is: 6
 */
package Array_02;

public class Maximum_Element_In_An_Array {

	public static void maximumElement(int[] arr) {
	
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if ( max < arr[i] ) {
				max = arr[i];
			}
		}
		System.out.println("Maximum element in an array is : "+max);
	}
	
	public static void main(String[] args) {
		int[] arr = {6, 3, 2, 1, 5, 5, 4, 8};
		maximumElement(arr);
	}

}
