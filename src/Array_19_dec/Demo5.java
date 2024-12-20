package Array_19_dec;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		if(size % 2 == 0) {
			System.out.println("Middle of array is : "+arr[size/2-1]+" , "+arr[size/2]);
		}else {
			System.out.println("Middle of array is : "+arr[size/2]);
		}
		sc.close();
	}
}
