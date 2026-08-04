class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=1;
        while(i<sb.length()){
            if(sb.charAt(i-1)==sb.charAt(i)){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);

                if(i>=2) {
                    i=i-1;
                }
                else{
                    i=1;
                } 
            }
            else{
                i++;
            }
           
        }
        return sb.toString();
    }
}