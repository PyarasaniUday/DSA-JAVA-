class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = 0;
        int m = skill.length-1;
        int res = skill[n]+skill[m];
        long fin_res=0;
        while(n<m){
            if(skill[n]+skill[m]==res){
                fin_res=fin_res+(long)(skill[n]*skill[m]);
                n++;
                m--;
            }
            else{
                return -1;
            }
        }
        return fin_res;
    }
}