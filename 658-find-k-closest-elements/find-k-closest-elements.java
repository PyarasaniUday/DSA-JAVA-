class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> li=new ArrayList<>();
        
        int i=0;
        int j=arr.length-1;

        while((j-i)>=k){
            int left=Math.abs(arr[i] - x);
            int right=Math.abs(arr[j] - x);
            if(left<=right){
                j--;
            }
            else{
                i++;
            }
        }
        for(int p = i; p <= j; p++){
             li.add(arr[p]);
        }
        return li;
    }
}