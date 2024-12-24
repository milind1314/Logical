package search_algorithm;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        int target = 75;

        while (start <= end){
            int mid = (start + end) / 2;
            if (target < arr[mid]){
                end = mid-1;
            }else if (target > arr[mid]){
                start = mid+1;
            }
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 10,20,30,40,50,32,53,12,15,75};
        System.out.println(binarySearch(arr));;

    }
}


