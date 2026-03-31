class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length; 

        int prefix = 0, cnt = 0; 
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,1);

        for(int i = 0; i < n; i++){
            prefix += nums[i];

            if(hash.containsKey(prefix%k)){
                cnt += hash.get(prefix%k);
            }

            hash.put(prefix%k,hash.getOrDefault(prefix%k,0)+1);
        }

        return cnt; 


    }
}