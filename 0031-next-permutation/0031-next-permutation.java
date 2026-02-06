class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, ind = -1;;
        int min = Integer.MAX_VALUE, minInd = -1; 
         for(int i = n-2; i >= 0; i--){

            if(nums[i] < nums[i+1]){
                ind = i; 
                break; 
            }
         }

        if(ind!=-1){ 
        for(int i = n-1; i > ind; i--){
            if(nums[i] > nums[ind]){
                swap(nums,ind,i);
                break; 
            }
        }
    }

        // Arrays.sort(nums,ind+1,n);
        reverse(nums,ind+1);

    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
     public void reverse(int[] arr, int start) {
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start++, end--);
        }
    }
}