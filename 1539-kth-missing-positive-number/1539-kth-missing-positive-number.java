class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            if(num <= k) k++; 
            else break; 
        }

        return k; 
    }
}