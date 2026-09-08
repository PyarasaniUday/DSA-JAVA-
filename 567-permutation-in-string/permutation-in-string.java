/*class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) {
            return false;
        }

        int k = s1.length();
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // frequency of s1
        for(int i = 0; i < k; i++) {
            count1[s1.charAt(i) - 'a']++;
        }

        // first window
        for(int i = 0; i < k; i++) {
            count2[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(count1, count2)) {
            return true;
        }

        // sliding window
        for(int i = k; i < s2.length(); i++) {

            // add new character
            count2[s2.charAt(i) - 'a']++;

            // remove old character
            count2[s2.charAt(i-k) - 'a']--;

            if(Arrays.equals(count1, count2)) {
                return true;
            }
        }

        return false;
    }
}
*/
class Solution {
    public boolean checkInclusion(String s1, String s2){
        if(s1.length()>s2.length()){
            return false;
        }
         
        int count1[]=new int[26];
        int count2[]=new int[26];

        int k=s1.length();
        for(int i=0;i<k;i++){
            count1[s1.charAt(i)-'a']++;
        }

        for(int i=0;i<k;i++){
            count2[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(count1,count2)){
            return true;
        }

        //slide win 
        for(int i=k;i<s2.length();i++){
            count2[s2.charAt(i)-'a']++;
            count2[s2.charAt(i-k)-'a']--;

            if(Arrays.equals(count1,count2)){
                return true;
            }
        }
        return false;
    }
}