class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length; 

        int[] ans = new int[n];

        for(int i = 0;i < n;i++){
            int cur = nums[i];
            int ind = (i+(cur%n)+n)%n;
            ans[i] = nums[ind];
        }
        return ans; 
    }
}

// This is complex problem for me, and I kind of struggle to truly understand it...!