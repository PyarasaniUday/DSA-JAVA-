/*class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        k=k%n;

        int res[]=new int[n];
        int j=0;

        //last k elems
        for(int i=n-k;i<n;i++){
            res[j]=arr[i];
            j++;
        }

        //remainin elems
        for(int i=0;i<n-k;i++){
            res[j]=arr[i];
            j++;
        }

        for(int i=0;i<n;i++) {
            arr[i]=res[i];
        }
    }
}
*/

class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        // Reverse entire array
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        // Reverse first k elements
        left = 0;
        right = k - 1;

        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        // Reverse remaining elements
        left = k;
        right = nums.length - 1;

        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}