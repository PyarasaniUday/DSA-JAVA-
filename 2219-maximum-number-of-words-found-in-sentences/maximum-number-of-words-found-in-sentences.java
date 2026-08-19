import java.util.*;

class Solution {
    public int mostWordsFound(String[] n) {
        int max = 0;
        for (int i = 0; i < n.length; i++) {
            int count = 1;
            for (int j = 0; j < n[i].length(); j++) {
                if (n[i].charAt(j) == ' ') {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}