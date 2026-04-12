class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = Integer.MAX_VALUE, ans = Integer.MAX_VALUE; 
        int max = 0; 
        while(low <= high){

            int mid = low + (high-low)/2;

            int totalH = totalHour(piles,mid);
            if(totalH <= h){
                ans = Math.min(ans,mid);
                high = mid - 1; 
            }
            else{
                low = mid + 1; 
            }
        }

        return ans; 
    }

    public int totalHour(int[] piles, int k){
        int total = 0; 

        for(int num: piles){
            int h = (num+k -1)/k;
            total += h; 
        }

        return total; 
    }
}