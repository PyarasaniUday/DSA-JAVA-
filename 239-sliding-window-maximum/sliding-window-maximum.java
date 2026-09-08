/*class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        
        int n=arr.length;
/*
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int max=sum;
        //list.add(max);
        for(int i=k;i<n;i++){
            sum=sum+arr[i]-arr[i-k];
            if(sum>max){
                max=sum;
            }
            list.add(max);
        }
        /*
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        
        



        for(int i=0;i<=n-k;i++){
            int max=arr[i];
            for(int j=1;j<k;j++){
                if(arr[i+j]>max){
                    max=max=arr[i+j];
                }
            }
            list.add(max);
        }
        int[] nums = list.stream().mapToInt(Integer::intValue).toArray();
        return nums;
    }
}

*/

import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0; i < arr.length; i++) {

            // Remove elements outside the window
            while(!dq.isEmpty() && dq.peekFirst() <= i-k) {
                dq.pollFirst();
            }

            // Remove smaller elements
            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            dq.addLast(i);

            // Window is ready
            if(i >= k-1) {
                list.add(arr[dq.peekFirst()]);
            }
        }

        int[] nums = list.stream()
                         .mapToInt(Integer::intValue)
                         .toArray();

        return nums;
    }
}