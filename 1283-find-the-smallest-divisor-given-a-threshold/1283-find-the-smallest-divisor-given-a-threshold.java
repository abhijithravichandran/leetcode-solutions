class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = Integer.MAX_VALUE, ans = -1; 

        while(low <= high){

            int mid = low + (high-low)/2;

            int sum = DivSum(nums,mid);

            if(sum > threshold){
                low = mid + 1; 
            }
            else{
                high = mid - 1;  
                ans = mid; 
            }
        }

        return ans; 
        
    }
    public int DivSum(int[] nums, int k){
        int sum = 0; 

        for(int num: nums){
            int n = (num+k-1)/k;
            sum += n; 
        }

        return sum; 
    }
}