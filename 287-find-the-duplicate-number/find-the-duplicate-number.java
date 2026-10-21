//cyclic sort 
/*
class Solution {
    public int findDuplicate(int[] nums) {
        /*
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return nums[j];
            }
        }

        return nums.length;
    }
    static void swap(int arr[] , int first , int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
    
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                return nums[i];
            }
        }
    }
    
    return -1;
    }
    
}

*/


import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                return nums[i];
            }

            set.add(nums[i]);
        }

        return -1;
    }
}
