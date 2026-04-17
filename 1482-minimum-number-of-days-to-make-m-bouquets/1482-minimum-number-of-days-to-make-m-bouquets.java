class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = 1, high = Arrays.stream(bloomDay).max().getAsInt(), ans = -1; 

        while(low <= high){
            int mid = low + (high-low)/2;
            boolean status = bouquets(bloomDay,m,k,mid);
            if(status){
                ans = mid; 
                high = mid - 1; 
            }
            else{
                low = mid + 1; 
            }
        }
        return ans; 
    }
    public boolean bouquets(int[] nums, int m, int k, int d){
        
        int totalB = 0, flower = 0; 

        for(int num: nums){

            if(num <= d){
                flower++; 
            }
            else{
                flower = 0; 
            }

            if(flower==k){
                totalB++; 
                flower = 0; 
            }
            if(totalB >=m) return true; 
        }

        return false; 
    }
}
