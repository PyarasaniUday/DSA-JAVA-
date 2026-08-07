/*class Solution {
    public char repeatedCharacter(String s) {
        for(int i=0;i<s.length();i++){
            for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    return s.charAt(i);
                }
            }
        }
        return ' ';
    }
}
*/
class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> h = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(h.contains(s.charAt(i)))
                return s.charAt(i);
            h.add(s.charAt(i));
        }
        return ' ';
    }
}