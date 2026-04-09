class Solution {
    public int singleNonDuplicate(int[] arr) {
        int low = 0, high = arr.length-1; 

        while(low <= high){

            int mid = low + (high-low)/2;

            if(mid==low && mid==high) return arr[mid];

            else if(low==mid && mid-1 < 0 || arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];

            if(mid%2==0){
                if(arr[mid]!=arr[mid+1]){
                    high = mid - 1; 
                }
                else{
                    low = mid + 1; 
                }
            }
            else{
                if(arr[mid]!=arr[mid-1]){
                    high = mid - 1; 
                }
                else{
                    low = mid + 1; 
                }
            }
        }
        return 0; 
    }
}