package Array_19_dec;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {

		int[] arr = { 100, 200, 300, 400, 500 };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter index of array : ");
		int i = sc.nextInt();
		System.out.println("Value of array at index  " + i + " : " + arr[i]);
		sc.close();
	}

}
