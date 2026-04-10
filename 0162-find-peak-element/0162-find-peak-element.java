class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length-1,n = nums.length-1;

        while(low <= high){

            int mid = low + (high-low)/2;

            if(low==mid && mid==high ) return mid; 

            else if(mid+1 <= high && nums[mid] < nums[mid+1]){
                low = mid + 1; 
            }
            else{
                high = mid; 
            }
        }

        return 0; 
    }
}