class Solution {
    public int countPartitions(int[] nums) {
        int len = nums.length;
        int sum = 0; 
        for(int i =0; i < len; i++){
            sum += nums[i];
        }
        int leftSum = 0, count = 0; 
        for(int i = 0; i < len-1; i++){
            leftSum += nums[i];
            if(leftSum%2 == (sum-leftSum)%2){
                count++;
            }
        }
        return count; 

    }
}