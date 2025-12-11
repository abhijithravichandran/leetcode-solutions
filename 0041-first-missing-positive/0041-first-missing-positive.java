class Solution {
    public int firstMissingPositive(int[] arr) {
        Arrays.sort(arr);
        int res = 1; 
        for(int i =0; i < arr.length; i++){
            
            if(arr[i]==res){
                res++; 
            }

            else if(arr[i] > res){
                break; 
            }
        }
        return res; 
         
    }
}