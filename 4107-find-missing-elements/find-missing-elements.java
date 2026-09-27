class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        /*
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=nums[0];i<nums[n-1];i++){
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
        */
        int first = nums[0];
        int last = nums[nums.length - 1];

        List<Integer> res = new ArrayList<Integer>();
        for(int i = first; i < last; i++) {
            boolean found = false;
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if(found == false) {
                res.add(i);
            }
        }

        return res;
    }
}