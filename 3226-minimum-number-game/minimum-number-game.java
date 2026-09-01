/*class Solution {
    public int[] numberGame(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        Collections.sort(list);
        ArrayList<Integer> res = new ArrayList<>();
        while(list.size()>1){
            int x=list.get(0);
            int y=list.get(1);
            list.remove(0);
            list.remove(0);
            res.add(y);
            res.add(x);
        }
        int arr[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
            arr[i]=res.get(i);
        }
        return arr;
    }
}
*/

class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }

        int[] arr=new int[pq.size()];
        int i=0;
        while(pq.size()>1){
            int a=pq.poll(); 
            int b=pq.poll();
            arr[i++]=b;
            arr[i++]=a;
        }
        return arr;
    }
}
