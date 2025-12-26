class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0) return 0; 

        int total = 0; 

        for(int i = 1; i < timeSeries.length; i++){
            int prev = timeSeries[i-1];
            int curr = timeSeries[i];

            total += Math.min(duration, curr-prev);
        }
        total += duration; 
        return total; 
    }
}