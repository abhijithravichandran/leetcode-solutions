class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length; 
        HashMap<Integer,Integer> hash = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0;i < n; i++){
            int num = target - nums[i];
            if(hash.containsKey(num)){
                res[0] = hash.get(num);
                res[1] = i; 
                break; 
            }
            hash.put(nums[i],i);
        }

        return res; 
    }
}