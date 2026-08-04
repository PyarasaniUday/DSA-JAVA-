
class Solution {
    public String removeStars(String s) {
        StringBuilder str = new StringBuilder(s);
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '*') {
                str.deleteCharAt(i);      
                str.deleteCharAt(i - 1);  
                i = Math.max(0, i - 2);
            } else {
                i++;
            }
        }
        return str.toString();
    }
}

/*
class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (char ch : stack) {
            ans.append(ch);
        }
        return ans.toString();
    }
}
*/