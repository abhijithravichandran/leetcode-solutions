class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1, n = nums.length; 

        for(int i = n-2; i>= 0; i--){
            if(nums[i] < nums[i+1]){
                ind = i; 
                break; 
            }
        }
        if(ind!=-1){ 
        for(int i = n-1; i > ind; i--){
            if(nums[i] > nums[ind]){
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp; 
                break; 
            }
        }
        }

        reverse(nums,ind+1);
    }
    public void reverse(int arr[], int i){
        int r = arr.length-1; 

        while(i  < r){
            int temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp; 
            i++; 
            r--; 
        }
    }
}