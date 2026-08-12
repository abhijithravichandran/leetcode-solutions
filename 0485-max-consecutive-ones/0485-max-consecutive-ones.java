class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length, cnt = 0, maxOnes = 0, curOnes = 0; 

        for(int i = 0; i < n; i++){
            if(nums[i]==0){
                curOnes = 0; 
            }
            else{
                curOnes++; 
            }
            maxOnes = Math.max(maxOnes,curOnes);
        }

        return maxOnes; 
    }
}