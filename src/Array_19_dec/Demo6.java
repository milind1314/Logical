package Array_19_dec;

import java.util.Scanner;

public class Demo6 {
public static void main(String[] args) {
	int[] arr = { 100, 200, 300, 400, 500 };
	Scanner sc = new Scanner(System.in);
	int size = arr.length;
	System.out.println("Addition of the last and first element of a given array : " + (arr[0] + arr[size - 1]));
	sc.close();
}
}
