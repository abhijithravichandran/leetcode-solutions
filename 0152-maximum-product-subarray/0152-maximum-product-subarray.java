class Solution {
    public int maxProduct(int[] nums) {
        int maxProd =  Integer.MIN_VALUE, leftToRight = 1, rightToLeft = 1, n = nums.length;

        for(int i = 0; i  < nums.length;  i++){

            if(leftToRight==0){
                leftToRight = 1; 
            }
            if(rightToLeft==0){
                rightToLeft = 1; 
            }

            leftToRight  *= nums[i];
            rightToLeft *= nums[n-i-1];

            maxProd = Math.max(maxProd,Math.max(leftToRight,rightToLeft));
        }

        return maxProd; 
    }
}