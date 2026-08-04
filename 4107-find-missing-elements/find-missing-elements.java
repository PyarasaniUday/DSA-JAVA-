class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=nums[0]+1;i<nums[n-1];i++){
            list.add(i);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if(list.get(i)==nums[j]){
                    flag=flag+1;
                    break;
                }
            }
            if(flag==0){
                res.add(list.get(i));
            }
        }
        return res;
    }
}