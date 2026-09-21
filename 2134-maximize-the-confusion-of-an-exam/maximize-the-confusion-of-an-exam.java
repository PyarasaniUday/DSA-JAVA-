//bfm 
/*
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {

        int max = 0;

        for (int i = 0; i < answerKey.length(); i++) {

            int t = 0;
            int f = 0;

            for (int j = i; j < answerKey.length(); j++) {

                if (answerKey.charAt(j) == 'T') {
                    t++;
                } else {
                    f++;
                }

                // Make all T
                if (f <= k) {
                    int len = j - i + 1;
                    max = Math.max(max, len);
                }

                // Make all F
                if (t <= k) {
                    int len = j - i + 1;
                    max = Math.max(max, len);
                }
            }
        }

        return max;
    }
}
*/
//sliding win variable 
class Solution {

    public int maxConsecutiveAnswers(String answerKey, int k) {

        int ans1 = solve(answerKey, k, 'T');
        int ans2 = solve(answerKey, k, 'F');

        return Math.max(ans1, ans2);
    }

    public int solve(String s, int k, char target) {

        int left = 0;
        int count = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            // If current character is NOT target,
            // we need to change it
            if (s.charAt(right) != target) {
                count++;
            }

            // Too many changes
            while (count > k) {

                if (s.charAt(left) != target) {
                    count--;
                }

                left++;
            }

            int len = right - left + 1;

            max = Math.max(max, len);
        }

        return max;
    }
}
