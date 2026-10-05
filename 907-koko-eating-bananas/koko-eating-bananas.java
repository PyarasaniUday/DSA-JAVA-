/*class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;

        // Find maximum pile
        for(int i = 0; i < piles.length; i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }

        // Try every possible speed
        for(int k = 1; k <= max; k++){

            int hours = 0;

            for(int i = 0; i < piles.length; i++){

                hours += (piles[i] + k - 1) / k;
            }

            if(hours <= h){
                return k;
            }
        }

        return max;
    }
}
*/class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        for(int i = 0; i < piles.length; i++){
            if(piles[i] > right){
                right = piles[i];
            }
        }

        while(left <= right){

            int mid = left + (right - left) / 2;

            long hours = 0;

            for(int i = 0; i < piles.length; i++){

                hours += piles[i] / mid;

                if(piles[i] % mid != 0){
                    hours++;
                }
            }

            if(hours <= h){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }

        return left;
    }
}