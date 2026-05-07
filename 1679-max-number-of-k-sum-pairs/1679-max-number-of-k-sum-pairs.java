class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length; 
        int op = 0; 
        int l = 0, r = n - 1; 

        while(l < r){

            int left = nums[l];
            int right  = nums[r];
            
            int sum = left + right; 

            if(sum==k){
                op++; 
                l++; 
                r--; 
            }
            else if(sum < k){
                l++; 
            }
            else{
                r--; 
            }
        } 

        return op;    
    }
}