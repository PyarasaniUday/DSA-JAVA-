//bfm 
/*
import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
*/
// optimal 2 pointer
 class Solution {
    public int[] sortedSquares(int[] nums) {

        int n=nums.length;

        int res[]=new int[n];

        int left=0;
        int right=n-1;
        int pos=n-1;

        while(left<=right){

            int leftSquare=nums[left]*nums[left];
            int rightSquare=nums[right]*nums[right];

            if(leftSquare>rightSquare){
                res[pos]=leftSquare;
                left++;
            }
            else{
                res[pos]=rightSquare;
                right--;
            }

            pos--;
        }

        return res;
    }
}
