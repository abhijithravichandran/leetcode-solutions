class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0, r = 0, p = 1, n = nums.length, cnt = 0; 
        if(k <= 1) return 0;
        while(r < n){

            p *= nums[r];

            while(p >= k && l <= r){
                p /= nums[l];
                l++; 
            }

            if(p < k) cnt += r-l+1; 
            r++; 
        }
        return cnt; 

    }
}