class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int maxLen = 0, l = 0;

        for(int r = 0; r < nums.length; r++){
            int cur = nums[r];
            map.put(cur,map.getOrDefault(cur,0)+1);
            while(map.get(cur) > k){
                int left = nums[l];
                map.put(left,map.get(left)-1);
                l++;
            }
            maxLen = Math.max(maxLen,r-l+1);
        }

        return maxLen; 
    }
}