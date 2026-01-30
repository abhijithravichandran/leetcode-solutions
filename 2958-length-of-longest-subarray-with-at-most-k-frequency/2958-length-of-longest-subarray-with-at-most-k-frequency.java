class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int maxLen = 0, l = 0, r = 0;

        while(r < nums.length){
            int cur = nums[r];
            map.put(cur,map.getOrDefault(cur,0)+1);

            if(map.get(cur)<=k) maxLen = Math.max(maxLen,r-l+1);

            while((map.get(cur)) > k && l <= r){
                int left = nums[l];
                map.put(left,map.get(left)-1);
                if(map.get(left)==0) map.remove(left);
                l++; 
            }
            r++; 
        }

        return maxLen; 
    }
}