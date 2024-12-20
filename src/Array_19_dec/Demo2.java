package Array_19_dec;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Entered array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");		}

		sc.close();
	}

}
