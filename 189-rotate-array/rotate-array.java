class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        k=k%n;

        int res[]=new int[n];
        int j=0;

        // Take last k elements
        for(int i=n-k;i<n;i++){
            res[j]=arr[i];
            j++;
        }

        // Take remaining elements
        for(int i=0;i<n-k;i++){
            res[j]=arr[i];
            j++;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = res[i];
        }
    }
}