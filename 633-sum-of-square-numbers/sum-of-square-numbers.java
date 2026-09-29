/*class Solution {
    public boolean judgeSquareSum(int c) {
        for(int i=0;i*i<=c;i++){
            for(int j=0;j*j<=c;j++){
                if(i*i+j*j==c){
                    return true;
                }
            }
        }
        return false;
    }
}
*/

class Solution {
    public boolean judgeSquareSum(int c) {

        long low = 0;
        long high = (int) Math.sqrt(c);

        while (low <= high) {
            long res = low * low + high * high;

            if (res == c) {
                return true;
            } 
            else if (res < c) {
                low++;
            } 
            else {
                high--;
            }
        }
        return false;
    }
}
