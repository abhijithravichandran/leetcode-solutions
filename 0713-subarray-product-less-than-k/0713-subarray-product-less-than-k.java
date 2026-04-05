class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int r = 0, l = 0, cnt = 0, n = nums.length; 
        int prod = 1; 

        if(k<=1) return 0; 

        while(r < n){
            prod *= nums[r];

            while(prod >= k && l <= r){
                prod /= nums[l];
                l++; 
            }

            if(prod < k) cnt +=  (r-l+1);
            r++; 
        }

        return cnt; 
    }
}