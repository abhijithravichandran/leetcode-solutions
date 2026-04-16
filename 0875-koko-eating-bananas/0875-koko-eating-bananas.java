class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        for(int num: piles){
            high = Math.max(high,num);
        }

        while(low <= high){

            int mid = low + (high-low)/2;

            long total = totalHour(piles,mid);

            if(total <= h){
                high = mid - 1; 
            }
            else{
                low = mid + 1; 
            }
        }

        return low; 
    }

    public long totalHour(int[] nums, int k){
        long sum = 0; 

        for(int num: nums){
            
            sum += (num+(long) k - 1)/k;
        }

        return  sum; 
    }
}