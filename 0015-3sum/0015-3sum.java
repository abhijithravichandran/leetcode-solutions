class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length; 

        List<List<Integer>> res = new ArrayList<>();

        for(int k = 0; k < n-2; k++){
            int i = k+1; 
            int j = n-1; 

            if(k > 0 && nums[k]==nums[k-1]) continue; // After seeing this line, and the complete logic, it is so amazing and magical 

            // This code is so great, because they handled the duplicates in the logic whereas I was struggling with hashmap. This code is so great and next level-- It's beyond my thinking for now.. It is so good and great.... 

            while(i < j){
                int sum = nums[k]+nums[i]+nums[j];
                int left = nums[i];
                int right = nums[j];

                if(sum==0){
                    res.add(Arrays.asList(nums[k],nums[i],nums[j]));
                    i++; 
                    j--; 

                    // Skip duplicates for left
                    while(i < j &&  nums[i]==nums[i-1])i++; 

                    // Skip duplicates for right
                    while(j > i && nums[j]==nums[j+1]) j--; 

                }
                else if(sum < 0){
                    i++; 
                }
                else{
                    j--;
                }
            }
            
        }
        return res; 
    }
}