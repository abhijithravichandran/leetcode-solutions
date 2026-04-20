class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low= 1, high = Arrays.stream(nums).max().getAsInt(), ans = -1; 

        while(low <= high){

            int mid = low + (high-low)/2;

            int val = sum(nums,mid);

            if(val <= threshold){
                ans = mid; 
                high = mid - 1; 
            }
            else{
                low = mid + 1; 
            }
        }

        return ans; 


    }

    public int sum(int[] nums, int d){
        int sum = 0; 
        for(int n: nums){
            sum += (n+d-1)/d;
        }

        return sum; 
    }
}