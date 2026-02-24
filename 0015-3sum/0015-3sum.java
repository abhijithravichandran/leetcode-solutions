class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length; 
        HashMap<List<Integer>,Integer> map = new HashMap<>();

        List<List<Integer>> res = new ArrayList<>();
        for(int k = 0; k < n-2; k++){
            int i = k+1, j = n-1;
            while(i < j){
                int num = nums[k]+nums[i]+nums[j];
                List<Integer> row = new ArrayList<>();
                row.add(nums[k]);
                row.add(nums[i]);
                row.add(nums[j]);
                if(num==0 && !map.containsKey(row)){
                    res.add(row);
                    map.put(row,1);
                    i++; 
                    j--; 
                }
                else if(num > 0){
                    j--; 
                }
                else if(num < 0){
                    i++; 
                }
                else {
                    i++; 
                    j--; 
                }

            }
        }
        return res; 
    }
}