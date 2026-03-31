class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length; 

        int prefix = 0, cnt = 0; 
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,1);

        for(int i = 0; i < n; i++){
            prefix += nums[i];

            int rem = prefix%k; 
            if(rem < 0) rem += k; 

            if(hash.containsKey(rem)){
                cnt += hash.get(rem);
            }

            hash.put(rem,hash.getOrDefault(rem,0)+1);
        }

        return cnt; 


    }
}