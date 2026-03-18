class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int cnt = 0; 
        int n = nums.size(); 

        for(int i = 0; i < n; i++){
            int num1 = nums.get(i);
            for(int j = i+1; j < n; j++){
                int sum = num1 + nums.get(j);
                if(sum < target) cnt++; 
            }
        }

        return cnt; 
    }
}