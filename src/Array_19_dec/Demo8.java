package Array_19_dec;

public class Demo8 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int size = arr.length;
		int sum = 0;
		System.out.println("The sum of array element is : ");
		for (int i = 0; i < size; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);

	}

}
