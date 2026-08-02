/*class Solution {
    public int maxOperations(int[] nums, int k) {
        int count =0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==-1)
                continue;
            for(int j=i+1;j<nums.length;j++) {
                if(nums[j]==-1)
                    continue;
                if(nums[i]+nums[j]==k) {
                    count++;
                    nums[i]=-1;
                    nums[j]=-1;
                    break;
                }
            }
        }
        return count;
    }
}
*/
import java.util.*;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == k) {
                count++;
                left++;
                right--;
            } 
            else if (sum < k) {
                left++;
            } 
            else {
                right--;
            }
        }

        return count;
    }
}