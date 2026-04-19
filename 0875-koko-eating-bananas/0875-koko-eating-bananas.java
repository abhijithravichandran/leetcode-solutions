class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = Arrays.stream(piles).max().getAsInt(), ans = -1; 

        while(low <= high){
            int mid = low + (high-low)/2;

            int timeTaken = totalHour(piles,mid);

            if(timeTaken <= h){
                ans = mid; 
                high = mid - 1; 
            }
            else{
                low = mid + 1; 
            }
        }

        return ans; 
    }

    public int totalHour(int[] piles, int b){
        int tHours = 0; 
        for(int p: piles){
            tHours += (p+b-1)/b;
        }

        return tHours; 
    }
}