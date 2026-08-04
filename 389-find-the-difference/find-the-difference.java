class Solution {
    public char findTheDifference(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < t.length(); i++)
            sum1 += t.charAt(i);

        for (int i = 0; i < s.length(); i++)
            sum2 += s.charAt(i);
        
        int sum=sum1-sum2;
        
        return (char) sum;
    }
}
/*class Solution {
    public char findTheDifference(String s, String t) {
        for (int j = 0; j < t.length(); j++) {
            boolean found = false;

            for (int i = 0; i < s.length(); i++) {
                if (t.charAt(j) == s.charAt(i)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return t.charAt(j);  
            }
        }
        return ' ';  
    }
}
*/
/*
class Solution {
    public char findTheDifference(String s, String t) {
        int xor = 0;
        for (char c : s.toCharArray()) xor ^= c;
        for (char c : t.toCharArray()) xor ^= c;
        return (char) xor;
    }
}
*/