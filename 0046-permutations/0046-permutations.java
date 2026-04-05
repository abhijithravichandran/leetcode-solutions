class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permutations(nums,res,0);
        return res; 
    }

    public void permutations(int[] nums, List<List<Integer>> res, int st){
        if(st==nums.length){
            List<Integer> list = new ArrayList<>();
            for(int each: nums){
                list.add(each);
            }
            res.add(new ArrayList<>(list));
            return; 
        }

        for(int i = st; i < nums.length; i++){
            int temp = nums[i];
            nums[i] = nums[st];
            nums[st] = temp; 

            permutations(nums,res,st+1);

            temp = nums[i];
            nums[i] = nums[st];
            nums[st] = temp; 
        }
    }

}