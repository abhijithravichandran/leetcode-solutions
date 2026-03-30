class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length; 

        HashMap<Integer,Integer> hash = new HashMap<>();
        int prefix = 0, cnt = 0; 

        for(int i = 0; i < n; i++){

            prefix += nums[i];
            if((prefix==k)) cnt++; 

            if(hash.containsKey(prefix-k)){
                cnt += hash.get(prefix-k);
            }
            hash.put(prefix,hash.getOrDefault(prefix,0)+1);

        }

        return cnt; 
    }
}