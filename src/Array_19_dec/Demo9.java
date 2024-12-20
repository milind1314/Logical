package Array_19_dec;

import java.text.DecimalFormat;

public class Demo9 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int size = arr.length;
		int sum = 0;
		System.out.println("The sum of array element is : ");
		for (int i = 0; i < size; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		double avg = (double) size / 2;
		System.out.println("The average element of array is : "+arr[(int) avg]);

		
		double avg1 = (double) sum / size;
		DecimalFormat dr = new DecimalFormat("00");
		System.out.println("The average element of array is : "+dr.format(avg1));
	}
}
