/*class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        Set<Character> pattern_string = new LinkedHashSet<>();
        for(char c : pattern.toCharArray()){
            pattern_string.add(c);
        }
        int n = pattern_string.size();
        for(int i=0;i<words.length;i++){
            Set<Character> word = new LinkedHashSet<>();
            for(int j=0;j<words[i].length();j++){
                word.add(words[i].charAt(j));
            }
            int m=word.size();
            if(n==m){
                res.add(words[i]);
            }
        }
        return res;
    }
}
*/
import java.util.*;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> res = new ArrayList<>();

        for (String word : words) {

            if (match(word, pattern)) {
                res.add(word);
            }
        }

        return res;
    }

    public boolean match(String word, String pattern) {

        if (word.length() != pattern.length()) {
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {

            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (map1.containsKey(w)) {
                if (map1.get(w) != p) {
                    return false;
                }
            } else {
                map1.put(w, p);
            }

            if (map2.containsKey(p)) {
                if (map2.get(p) != w) {
                    return false;
                }
            } else {
                map2.put(p, w);
            }
        }

        return true;
    }
}