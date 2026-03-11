class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        int ind = 0; 
        int n = nums.length; 
        for(int i = 0; i < n; i++){
            if(nums[i] < pivot){
                arr[ind] = nums[i];
                ind++;                 
            }
            
        }
        for(int i = 0; i < n; i++){
            if(nums[i] == pivot){
                arr[ind] = nums[i];
                ind++; 
            }

        }
        for(int i = 0; i < n; i++){
            if(nums[i] > pivot){
                arr[ind] = nums[i];
                ind++; 
            }

        }

        return arr; 
    }
}