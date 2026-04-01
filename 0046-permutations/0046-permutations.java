class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permutations(nums,res,0);
        return res; 
    }

    public void permutations(int[] nums, List<List<Integer>> res, int ind){

        if(ind==nums.length){
            List<Integer> list = new ArrayList<>();
            for(int num: nums){
                list.add(num);
            }
            res.add(list);
            return; 
        }

        for(int i = ind; i < nums.length; i++){

            int temp = nums[ind];
            nums[ind] = nums[i];
            nums[i] = temp; 

            permutations(nums,res,ind+1);

            temp = nums[ind];
            nums[ind] = nums[i];
            nums[i] = temp; 
        }
    }
}