class Solution {
    public int sumFourDivisors(int[] nums) {
        int maxSum = 0; 
        for(int i = 0; i < nums.length; i++){
            int cur = countDivisors(nums[i]);
            maxSum += cur; 
        }
        return maxSum; 
    }
    public int countDivisors(int num){
        int count = 0, sum = 0; 
        for(int i = 1; i*i <= num; i++){
            if(num%i==0){
                count++; 
                sum+= i; 
                if((num/i)!=i){
                    count++; 
                    sum += (num/i);
                }
            }
            if(count > 4) break; 
        }
        if(count!=4) return 0; 
        return sum; 
    }
}