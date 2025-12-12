class Solution {
    public int maxProduct(int[] nums) {
        int prod = 1; 
        int maxProd = Integer.MIN_VALUE; 
        int len = nums.length; 
        int leftSub = 0, rightSub = 1; 

        for(int i = 0; i < len; i++){
            
            
            if(leftSub==0) leftSub=1; 
            if(rightSub==0) rightSub=1;

            leftSub *= nums[i];

            rightSub *= nums[len-i-1];

            maxProd = Math.max(leftSub,Math.max(maxProd,rightSub));

        }
        return maxProd; 
    }
}