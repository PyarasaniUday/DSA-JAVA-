/*class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                list.add(nums[i]);
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                list.add(nums[i]);
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }

        return nums;
    }
}
*/
//2 pointer 

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=0;
        while(i<nums.length) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
        return nums;
    }
}