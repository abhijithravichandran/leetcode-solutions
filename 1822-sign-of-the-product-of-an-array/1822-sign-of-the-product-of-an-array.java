class Solution {
    public int arraySign(int[] nums) {
        int negaCnt = 0; 
        for(int i= 0; i < nums.length;i++){
            int num = nums[i];
            if(num==0) return 0; 
            if(num < 0) negaCnt++; 

        }
        if(negaCnt % 2 !=0) return -1; 
        return 1; 
    }
}