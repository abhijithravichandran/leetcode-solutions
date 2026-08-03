class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length; 

        k = k%n; 

        if(n==0 || k==0 || k > n) return; 

        rev(nums,n-k,n-1);
        rev(nums,0,n-k-1);
        rev(nums,0,n-1);
    }

    public void rev(int[] arr, int i, int j){
        
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
            i++; 
            j--;
        }
    }
}