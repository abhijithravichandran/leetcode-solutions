class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; 
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp; 
                j++; 
            }
        }
        
    }
}

// This code is amazing, and I still kind of have hard time truly get it. I still feel like I don't fully get it.. And this swapping, and mainly the checking is so great and so amazing.... 
