class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int n = hours.length; 
        int cnt = 0; 

        for(int num: hours){
            if(num >= target) cnt++; 
        }
        return cnt; 
    }
}