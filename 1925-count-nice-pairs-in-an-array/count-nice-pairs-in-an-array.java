/*class Solution {
    public int countNicePairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1 ; j<nums.length;j++){
                if(nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])){
                    count =count+1;
                }
            }
        }
        return count;
    }
    public int rev(int n) {
            int rev = 0;
            while(n > 0) {
                int rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;
            }
            return rev;
    }
}*/

class Solution {
    public int countNicePairs(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int mod = 1000000007;

        for(int i = 0; i < nums.length; i++) {

            int value = nums[i] - rev(nums[i]);

            count = (count + map.getOrDefault(value, 0)) % mod;

            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        return count;
    }

    public int rev(int n) {

        int rev = 0;

        while(n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        return rev;
    }
}