class Solution {
    public int maxProduct(int[] nums) {
        int max = 0; 
        int secMax = 0; 
        int ind = -1; 

        if(nums.length == 2){
            return (nums[0]-1)*(nums[1]-1);
        }

        for(int i =0; i < nums.length; i++){
            if(nums[i] > max){
                secMax =  max; 
                max = nums[i];
                ind = i; 
            }
            else if((i!=ind || nums[i]!=max) && nums[i] > secMax){
                secMax = nums[i];
            }
        }
        return (max-1)*(secMax-1);
    }
}