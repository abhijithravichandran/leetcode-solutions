class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();

        int n = nums.length; 

        for(int i = 0; i < n-2; i++){
            Set<Integer> hash = new HashSet<>();
            
            
            for(int j = i+1; j < n; j++){
                List<Integer> row = new ArrayList<>();
                int num = -(nums[i]+nums[j]);
                if(hash.contains(num)){
                    row.add(nums[i]);
                    row.add(nums[j]);
                    row.add(num);
                    Collections.sort(row);
                    set.add(row);
                }
                hash.add(nums[j]);
            }
        }
        // for(List<Integer> list: set){
        //     res.add(list);
        // }
        return new ArrayList<>(set); 
    }
}