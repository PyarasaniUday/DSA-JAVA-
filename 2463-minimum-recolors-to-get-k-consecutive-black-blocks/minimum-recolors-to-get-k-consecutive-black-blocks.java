class Solution {
    public int minimumRecolors(String blocks, int k) {
        int w=0;
        int min=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W' || blocks.charAt(i)=='w'){
                w++;
            }
        }
        min=w;
        //slide window
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i-k)=='W' || blocks.charAt(i-k)=='w'){
                w--;
            }
            if(blocks.charAt(i)=='W' || blocks.charAt(i)=='w'){
                w++;
            }
            if(w<min){
                min=w;
            }
        }
        return min;
    }
}