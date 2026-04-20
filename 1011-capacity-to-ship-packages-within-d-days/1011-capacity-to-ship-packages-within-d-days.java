class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt() , high = Arrays.stream(weights).sum(), ans = -1; 

        while(low <= high){

            int mid = low + (high-low)/2;

            int d = totalDays(weights,mid);

            // What this line says is, if it's less than given days then we will save that and then we will check if any days that exists smaller than this day, that's why moving high = mid - 1; 
            if(d <= days){
                ans = mid; 
                high = mid - 1; 
            }
            else{
                low = mid + 1; 
            }
        }

        return ans; 
        
    }

    public int totalDays(int[] weights, int limit){
        int sum = 0, days = 1; 

        for(int w: weights){
            if(sum+w > limit){
                days++; 
                sum = w; 
            }
            else{
                sum += w; 
            }
        }  

        return days; 
    }
}

