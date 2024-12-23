package Array_02;

public class Print_Duplicate_Element_In_Array {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 4, 5 };

		int size = arr.length;

		System.out.print("Duplicate Elements in array is : ");
		for (int i = 0; i < size; i++) {

			int count = 0;
			for (int j = i; j < size; j++) {

				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
