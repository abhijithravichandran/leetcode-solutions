class Solution {
    public int minimumCost(int[] nums) {
        int sum = nums[0];
        int min1 = Integer.MAX_VALUE; 
        int min2 = Integer.MAX_VALUE; 
        for(int i = 1; i < nums.length; i++){
            
            if(nums[i] < min1){
                min2 = min1; 
                min1 = nums[i];
            }
            else if(nums[i] < min2){
                min2 = nums[i];
            }
        }

        sum += min1 + min2; 

        return sum; 
    }
}

// Why that if-else condition, because at the start we get the lowest element, then the first condition 
//  won't get executed, so we may miss the second-lowest element. So, to handle that, the second if-else condition. 