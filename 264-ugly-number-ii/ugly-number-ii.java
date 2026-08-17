/*class Solution {
    public int nthUglyNumber(int n) {
        int count = 0;
        int num=1;
        while(true){
            int i=num;
            while (i % 2 == 0) {
                i = i / 2;
            }

            while (i % 3 == 0) {
                i = i / 3;
            }

            while (i % 5 == 0) {
                i = i / 5;
            }

            if(i==1){
                count = count + 1;
            }

            if(count == n){
                return num;
            }
            num++;
        }
    }
}
*/
class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;

        int i2 = 0, i3 = 0, i5 = 0;

        for (int i = 1; i < n; i++) {
            int next2 = dp[i2] * 2;
            int next3 = dp[i3] * 3;
            int next5 = dp[i5] * 5;

            dp[i] = Math.min(next2, Math.min(next3, next5));

            if (dp[i] == next2) i2++;
            if (dp[i] == next3) i3++;
            if (dp[i] == next5) i5++;
        }

        return dp[n - 1];
    }
}
