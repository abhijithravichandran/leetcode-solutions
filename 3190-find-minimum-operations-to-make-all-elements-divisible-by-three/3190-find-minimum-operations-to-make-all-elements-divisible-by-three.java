class Solution {
    public int minimumOperations(int[] nums) {
        int ops = 0; 

        for(int num: nums){
            int div = num/3;
            int num1 = ((div+1)*3 - num);
            int num2 = num%3;
            ops += Math.min(num1,num2);
        }
        return ops; 
    }
}