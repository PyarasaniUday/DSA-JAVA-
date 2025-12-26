import java.util.*;
public class BubbleSort {
    static void bubblesort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[]={12,32,54,14,37,8};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

//using int as return type 
/*
class Solution {

    public int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;

            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }

            // optimization: stop if already sorted
            if (!swapped) break;
        }
        return nums;
    }
}
    */
