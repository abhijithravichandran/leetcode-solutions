class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigit = 0, doubleDigit = 0; 

        for(int num: nums){
            if(num > 9) doubleDigit += num; 
            else singleDigit += num; 

        }
        if(doubleDigit==singleDigit) return false; 
        return true; 
    }
}