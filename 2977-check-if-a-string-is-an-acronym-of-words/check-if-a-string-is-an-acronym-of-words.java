class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<words.size();i++){
            res.append(words.get(i).charAt(0));
        }
        if(res.toString().equals(s)){
            return true;
        }
        return false;
    }
}