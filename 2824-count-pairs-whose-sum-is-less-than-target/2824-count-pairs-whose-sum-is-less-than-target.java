class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);

        int i = 0, j = nums.size()-1; 
        int cnt = 0; 

        while(i < j){
            int left = nums.get(i);
            int right = nums.get(j);
            int sum = left + right; 

            if(sum < target){
                cnt += j - i; 
                i++; 
            }
            else{
                j--; 
            }
        }

        return cnt; 
    }
}