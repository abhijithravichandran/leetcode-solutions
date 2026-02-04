class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0, neg = 1; 
        int n = nums.length; 

        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            int cur = nums[i];

            if(cur >= 0){
                ans[pos] = cur; 
                pos +=2; 
            }
            else{
                ans[neg] = cur; 
                neg +=2; 
            }
        }

        return ans; 
    }
}