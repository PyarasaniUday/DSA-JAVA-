//bfm
/*
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
}

*/

//optimal 2 pointer 
class Solution {
    public boolean isPalindrome(String s) {

        int left=0;
        int right=s.length()-1;

        while(left<right){

            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) !=
               Character.toLowerCase(s.charAt(right))){

                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}