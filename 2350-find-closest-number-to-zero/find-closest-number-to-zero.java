/*import java.util.*;
class Solution {
    public int findClosestNumber(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(Math.abs(nums[i]-0));
        }
        Collections.sort(l);
        return l.get(0);
    }
}
*/
            
class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = nums[0];

        for(int i=1;i<nums.length;i++) {

            if (Math.abs(nums[i])<Math.abs(ans)) {
                ans = nums[i];
            }
            else if (Math.abs(nums[i])==Math.abs(ans) && nums[i]>ans){
                ans=nums[i];
            }
        }

        return ans;
    }
}