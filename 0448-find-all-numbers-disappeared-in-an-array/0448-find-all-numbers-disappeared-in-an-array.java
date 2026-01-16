class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length; 
        Set<Integer> seen = new HashSet<>();
        for(int i = 0; i < len; i++){
            seen.add(nums[i]);
        }

        List<Integer> res = new ArrayList<>();
        for(int i = 1; i <= len; i++){
            if(!seen.contains(i)) res.add(i);
        }
        return res; 
    }
}