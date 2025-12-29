class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length; 

        int[] leftSum = new int[len];
        int[] rightSum = new int[len];
        int[] answer = new int[len];

        int rightSums = 0, leftSums = 0; 
        int j = nums.length-1; 
        for(int i = 0; i < len; i++){
            leftSum[i] = leftSums; 
            rightSum[j] = rightSums; 
            leftSums += nums[i];
            rightSums += nums[j--];
        }
        
        for(int i = 0; i < len; i++){
            answer[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        
        return answer; 
        
    }
}