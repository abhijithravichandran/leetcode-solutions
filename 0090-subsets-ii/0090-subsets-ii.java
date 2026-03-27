class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        subsetTwo(nums,res,list,0);
        List<List<Integer>> result = new ArrayList<>(res);
        return result; 
    }

    public void subsetTwo(int[] nums, Set<List<Integer>> res, List<Integer> list,int ind){
        if(ind >= nums.length){
            res.add(new ArrayList<>(list));
            return; 
        }

        list.add(nums[ind]);
        subsetTwo(nums,res,list,ind+1);

        list.remove(list.size()-1);
        subsetTwo(nums,res,list,ind+1);

    }
}