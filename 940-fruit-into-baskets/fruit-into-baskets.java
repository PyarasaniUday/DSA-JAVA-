/*class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int max=0;
        int freq[]=new int[fruits.length+1];
        int count=0;
        for(int right=0;right<fruits.length;right++){
            if(freq[fruits[right]]==0){
                count++;
            }

            freq[fruits[right]]++;

            while(count>2){
                freq[fruits[left]]--;
                if(freq[fruits[left]]==0){
                    count--;
                }
                left++;
            }

            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
*/

import java.util.*;

class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int max = 0;
        int count = 0;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            if (!freq.containsKey(fruits[right])) {
                count++;
            }

            freq.put(fruits[right],
                     freq.getOrDefault(fruits[right], 0) + 1);

            while (count > 2) {
                freq.put(fruits[left], freq.get(fruits[left]) - 1);

                if (freq.get(fruits[left]) == 0) {
                    freq.remove(fruits[left]);
                    count--;
                }

                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
