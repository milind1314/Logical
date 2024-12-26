/*
 Implement a Java program to find the frequency of each element in an  integer array and display the results.
 */
package copyArray;

public class FrequencyOfEachElement {

	public static void frequencyFinder(int[] arr) {
		for(int i=0;i<arr.length;i++) {
		int count=1,found=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j] && i>j) {
				count++;
			}
			if(arr[i]==arr[j]&& i<j) {
				found++;
				break;
			}
		}
		if(found==0) {
			System.out.println(arr[i]+":is present : "+count+" times");
		}
		
	}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 4, 2, 4, 3, 4, 3, 5, 2 };
		frequencyFinder(arr);
	}

}
