class Solution {
    public void rotate(int[] nums, int k) {
        
        

        k = k%nums.length; 
        int len = nums.length; 

        if(len==0 || k==0) return; 

        rev(nums,0,len-k-1);
        rev(nums,len-k,len-1);
        rev(nums,0,len-1);
    }

    public void rev(int[] nums, int left, int right){
        
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}