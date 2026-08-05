class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                count++;
            }
        }
        // 1st and 2nd case 
        if(count==word.length() || count==0){
                return true;
        }
        //3rd case 
        if(count==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;
    }
}