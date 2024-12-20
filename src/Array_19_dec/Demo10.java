package Array_19_dec;

public class Demo10 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int size = arr.length;
		System.out.print("Array in reverse order is : ");
		for (int i = 1; i <= size; i++) {
			System.out.print(arr[size-i]+" ");
		}
	}

}
