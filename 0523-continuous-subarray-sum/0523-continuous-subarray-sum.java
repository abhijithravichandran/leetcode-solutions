class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length; 
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,-1);
        int prefix = 0; 

        for(int i = 0; i < n;i++){
            prefix += nums[i];
            if(hash.containsKey(prefix%k)  && i-hash.get(prefix%k) > 1){
                return true; 
            }
            else if(!hash.containsKey(prefix%k)){
                hash.put(prefix%k,i);
            }
        }

        return false; 
    }
}