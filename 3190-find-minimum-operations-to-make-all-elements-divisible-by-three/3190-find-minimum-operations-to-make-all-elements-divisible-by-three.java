class Solution {
    public int minimumOperations(int[] nums) {
        
        int cnt = 0; 
        for(int num: nums){
            int div = (num/3);
            int mod1 = ((div+1)*3 - num);
            int mod2 = num%3; 

            cnt += Math.min(mod1,mod2);
        }
        return cnt; 
    }
}