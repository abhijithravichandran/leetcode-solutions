class Solution {
    public int alternatingSum(int[] nums) {
        int n = nums.length;
        int oddInd = 0; 
        int evenInd = 0; 

        for(int i = 0; i < n; i++){
            int num = nums[i];
            if(i%2==0){
                evenInd += num; 
            }
            else{
                oddInd += num; 
            }
        }
        return evenInd-oddInd; 
    }
}