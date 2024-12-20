package Array_19_dec;

import java.util.Random;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(1,100);
		}

		System.out.println("Entered array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+". "+arr[i] + " ");		}
		sc.close();
	}

}
