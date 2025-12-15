class Solution {
    public long getDescentPeriods(int[] prices) {
        int len = prices.length; 
        long curr = 1; 
        long count = 1; 

        for(int i = 1; i < len; i++){
            if(prices[i-1]-prices[i]==1){
                curr++; 
                
            }
            else{
                curr = 1; 
            }
            count += curr; 
        }
        return count; 
    }
}