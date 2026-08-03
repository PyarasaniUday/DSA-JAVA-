class Solution {
    public boolean wordPattern(String pattern, String s) {
        /*Set<Character> pattern_set= new Set<>();
        for(int i=0;i<pattern.length();i++){
            pattern_set.add(patter.cahrAt(i));
        }

        Set<
        */
        String[] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            for(int j=i+1;j<pattern.length();j++){
                if(pattern.charAt(i)==pattern.charAt(j)){
                    if(!(words[i].equals(words[j]))){
                        return false;
                    }
                }
                else{
                    if(words[i].equals(words[j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}