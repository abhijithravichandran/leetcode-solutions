class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long n = nums.length; 

        long prefix = 0, pre = 0, maxSum = Long.MIN_VALUE; 

        HashMap<Integer, Long> hash = new HashMap<>();

        for(int i = 0; i < n; i++){
            prefix += nums[i];            

            if(hash.containsKey(nums[i]-k) || hash.containsKey(k+nums[i])){
                long n1 = Long.MIN_VALUE; 
                long n2 = Long.MIN_VALUE; 
                if(hash.containsKey(nums[i]-k)) n1 = prefix-hash.get(nums[i]-k);
                if(hash.containsKey(nums[i]+k)) n2 = prefix - hash.get(nums[i]+k);

                Long sum = Math.max(n1,n2);
                
                maxSum = Math.max(maxSum, sum);
                
            }

            // ✅ FIX: keep minimum prefix instead of first occurrence
            hash.put(nums[i], Math.min(hash.getOrDefault(nums[i], Long.MAX_VALUE), pre));

            pre += nums[i];
        }

        maxSum = (maxSum!=Long.MIN_VALUE) ? maxSum : 0; 
        return maxSum; 
    }
}