class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n  = nums.length; 
        long tar = target;
        Set<List<Integer>> seen = new HashSet<>();
        // List<List<Integer>> list = new ArrayList<>();
        for(int k = 0; k < n-3;  k++){

            // if(k > 0 && nums[k]==nums[k-1]) continue; 

            for(int l = k+1; l < n-2; l++){

                // if(l > 1 && nums[l]==nums[l-1]) continue; 

                int i = l+1, j = n-1; 

                while(i < j){
                    long sum = (long)nums[k]+ (long) nums[l]+(long) nums[i]+(long) nums[j];
                    if(sum==tar){
                        seen.add(Arrays.asList(nums[k],nums[l],nums[i],nums[j]));
                        i++; 
                        j--; 

                        while(i < j && nums[i]==nums[i-1])i++; 

                        while(j > i && nums[j]==nums[j+1]) j--; 
                    }
                    else if(sum < tar) i++; 
                    else if(sum > tar) j--; 
                }
            }
        }

        // return list; 
        return new ArrayList<>(seen);

    }
}
