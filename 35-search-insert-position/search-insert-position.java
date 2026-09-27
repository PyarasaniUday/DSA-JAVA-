//Binary Search
class Solution {
    public int searchInsert(int[] arr, int x) {
        int low=0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low +(high-low)/2;
            if(x<arr[mid]){
                high=mid-1;
            }
            else if (x>arr[mid]){
                low=mid+1;
            }
            else{
                return mid;
            }
        }
        return low;
    }
}