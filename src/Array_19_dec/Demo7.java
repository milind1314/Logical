package Array_19_dec;


public class Demo7 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int size = arr.length;
		System.out.println("The even element of array is : ");
		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0) {
			System.out.println(arr[i]);	
			}
		}
		System.out.println("The odd element of array is : ");
		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);	
			}
		}
	}

}
