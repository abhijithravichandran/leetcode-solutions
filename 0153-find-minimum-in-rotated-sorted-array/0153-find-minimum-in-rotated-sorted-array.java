class Solution {
    public int findMin(int[] arr) {
        int n = arr.length, low = 0, high = n-1, min = Integer.MAX_VALUE;

        // Simply-I'm taking the possible minimum and reducing the search-space. 
        // Just reducing the search space - because in rotated array, either half will be sorted 
        // I easliy sovled it - because I know the data that - either half is guaranteed to be sorted

        while(low <= high){

            int mid = low + (high-low)/2;

            if(arr[low] <= arr[high]){
                min = Math.min(arr[low],min);
                break; 
            }

            if(arr[low] <= arr[mid]){
                min = Math.min(arr[low], min);
                low = mid + 1; 
            }
            else{
                min = Math.min(arr[mid],min);
                high = mid - 1; 
            }

        }

        return min; 
    }
}