class Solution {
    public boolean search(int[] arr, int target) {
        int n = arr.length, low = 0, high = n-1; 

        while(low <= high){

            int mid = low + (high-low)/2;

            if(arr[mid]==target) return true; 

            while(low < mid && arr[mid]==arr[low]){
                low++; 
            }
            while(high > mid && arr[high]==arr[mid] ){
                high--; 
            }

            mid = low + (high - low)/2;

            if(arr[mid]==target) return true; 

            else if(low > high) break;

            else if(arr[low] <= arr[mid]){

                if(arr[low] <= target && target < arr[mid]){
                    high = mid - 1; 
                }
                else{
                    low = mid + 1; 
                }
            }
            else{
                if(arr[mid] < target && target <= arr[high]){
                    low = mid + 1; 
                }
                else{
                    high = mid - 1; 
                }
            }
        }

        return false; 
    }
}