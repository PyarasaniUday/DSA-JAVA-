/*class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int res=nums[0];
        for(int i=0;i<n;i++){
            int p=1;
            for(int j=i;j<n;j++){
                p=p*nums[j];

                if(p>res){
                    res=p;
                }
            }
        }
        return res;
    }
}
*/

//sw 

class Solution {
    public int maxProduct(int[] nums) {

        int max = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int num = nums[i];

            int tempMax = currentMax;

            currentMax = Math.max(num,
                    Math.max(currentMax * num, currentMin * num));

            currentMin = Math.min(num,
                    Math.min(tempMax * num, currentMin * num));

            max = Math.max(max, currentMax);
        }

        return max;
    }
}