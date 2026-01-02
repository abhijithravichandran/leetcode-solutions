class Solution {
    public int repeatedNTimes(int[] nums) {
        int len = nums.length; 
        ArrayList<Integer> seen = new ArrayList<>();
        for(int i = 0; i < len;i++){
            if(seen.contains(nums[i])) return nums[i];
            seen.add(nums[i]);
        }
        return 0; 
    }
}