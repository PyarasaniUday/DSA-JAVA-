class Solution {
    public int longestSubstring(String s, int k) {
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            int[] count=new int[26];
            for(int j=i;j<s.length();j++){
                count[s.charAt(j)-'a']++;
                
                boolean valid=true;
                
                for(int x=0;x<26;x++){
                    if(count[x]>0 && count[x]<k){
                        valid=false;
                        break;
                    }
                }
                
                if(valid){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }
        return maxlen;
    }
}