/*class Solution {
    public int removeDuplicates(int[] nums) {

        ArrayList<Integer> res = new ArrayList<>();

        res.add(nums[0]);

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] != nums[i - 1]) {
                res.add(nums[i]);
            }
        }

        for(int i = 0; i < res.size(); i++) {
            nums[i] = res.get(i);
        }

        return res.size();
    }
}
*/
class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;

        for(int j = 1; j < nums.length; j++) {

            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}