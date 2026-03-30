class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; 
        int left = 1, right = 1; 


        int[] suffix = new int[n];
        int[] prefix = new int[n];
        int[] result = new int[n];

        for(int i = n-1; i >= 0; i--){
            suffix[i] = left; 
            left *= nums[i];
            
        }

        for(int i = 0; i < n; i++){
            prefix[i] = right; 
            right *= nums[i];
            
        }

        for(int i = 0; i < n; i++){
            result[i] = suffix[i]*prefix[i];
        }

        return result; 

    }
}