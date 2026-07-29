class Solution {
    public int maximumProduct(int[] nums) {
        int  n = nums.length; 

        int prod1 = 0, prod2 = 0; 

        int min1 = 0, min2 = 0; 
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE; 

        for(int i = 0; i < n; i++){
            int cur = nums[i];

            if(min1 > cur && cur < 0){
                min2 = min1; 
                min1 = cur; 
            }
            else if(cur < min2){
                min2 = cur; 
            }

            if(cur >= max1){
                max3 = max2; 
                max2 = max1; 
                max1 = cur; 
            }
            else if(cur >= max2){
                max3 = max2; 
                max2 = cur; 
            }
            else if( cur >= max3){
                max3 = cur; 
            }
        }

        prod1 = max1 * max2 * max3;  
        prod2 = max1 * min1 * min2; 

        return Math.max(prod1,prod2);

    }
}