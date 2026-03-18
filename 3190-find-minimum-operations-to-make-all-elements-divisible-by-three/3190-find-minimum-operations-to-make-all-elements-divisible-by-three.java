class Solution {
    public int minimumOperations(int[] nums) {
        int cnt = 0; 
        for(int num: nums){
            if(num%3==0) continue; 
            if(num < 3 ){
                cnt++; 
            }
            else{
                int less = Math.min((num%3),1);
                cnt += less; 
            }
        }

        return cnt; 
    }
}