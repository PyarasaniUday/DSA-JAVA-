class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total_sum=0;
        for(int i=0;i<cardPoints.length;i++){
            total_sum=total_sum+cardPoints[i];
        }

        int win_size=cardPoints.length-k;
        int sum=0;
        for(int i=0;i<win_size;i++){
            sum=sum+cardPoints[i];
        }
        int min=sum;
        //slide win
        for(int i=win_size;i<cardPoints.length;i++){
            sum=sum+cardPoints[i]-cardPoints[i-win_size];

            if(sum<min){
                min=sum;
            }
        }
        return total_sum-min; 
    }
}