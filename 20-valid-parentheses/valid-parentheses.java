class Solution {
    public boolean isValid(String s) {
        /*
        if(s.contains("(") && s.contains(")")){
            return true ;
        }
        else if(s.contains("{") && s.contains("}")){
            return true ;
        }
        else if(s.contains("[") && s.contains("]")){
            return true ;
        }
        else{
            return false ;
        }
        */
        
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.length() == 0;
        
    }
}