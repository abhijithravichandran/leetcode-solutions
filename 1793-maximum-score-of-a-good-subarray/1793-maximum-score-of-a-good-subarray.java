class Solution {
    public int maximumScore(int[] nums, int k) {
        int r = k, l = k; 
        int res = nums[k];
        int curMin = nums[k];
        int left = 0, right = 0; 
        while(l > 0 || r < nums.length-1){
            if(l > 0) left = nums[l-1];
            else left = 0; 
            if(r < nums.length-1) right = nums[r+1];
            else right = 0; 

            if (left > right){
                curMin = Math.min(curMin,left);
                l--;
            }
            else{
                curMin = Math.min(curMin,right);
                r++;
            }

            res = Math.max(res,(curMin * (r-l+1)));

        }
        return res; 
    }
}