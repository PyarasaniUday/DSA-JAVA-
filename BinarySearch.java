//import java.util.*;
/* 
public class BinarySearch {
    static int binarysearch(int arr[], int x){
        int low=0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low +(high-low)/2;
            if(x<arr[mid]){
                high=mid-1;
            }
            else if (x>arr[mid]){
                low=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int arr[]={12,2,75,43,23,14,89,91,37};
        int x=91;
        System.out.println(binarysearch(arr,x));
    }
}

*/
/*
import java.util.Arrays;

public class BinarySearch {

    static int binarySearch(String[] arr, String key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int cmp = key.compareTo(arr[mid]);

            if (cmp < 0) {
                high = mid - 1;
            }
            else if (cmp > 0) {
                low = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "grape", "cherry", "mango"};
        Arrays.sort(arr);   

        String key = "mango";
        System.out.println(binarySearch(arr, key));
    }
}
*/

import java.util.Arrays;

class BinarySearch{
    static int[] search(int[][] matrix ,int target){
        int r=0;
        int c=matrix.length-1;

        while(r<matrix.length && c>=0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        int arr[][]= {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16}
        };
        //int target=3;
        String ans = Arrays.toString(search(arr, 9));
        System.out.println(ans);
    }
}
