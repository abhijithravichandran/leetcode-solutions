class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length-1; 
        for(int i = 0; i < nums.length; i++){
            nums[i] *= nums[i];
        }
        int[] result = new int[right+1];
        int ind = right; 
        while(left <= right){

            if(nums[left] > nums[right]){
                result[ind] = nums[left];
                left++; 
            }
            else{
                result[ind] = nums[right];
                right--; 
            }
            ind--; 
        }

        return result; 
    }
}