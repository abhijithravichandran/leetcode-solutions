class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length; 
        int[] arr = new int[n];
        
        int ind = 0; 
        for(int num: nums){
            if(num < pivot) arr[ind++] = num; 
        }


        for(int num: nums){
            if(pivot==num) arr[ind++] = num; 
        }

        for(int num: nums){
            if(num > pivot) arr[ind++] = num; 
        }

        return arr; 
    }
}