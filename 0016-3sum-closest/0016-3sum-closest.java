class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length; 
        int closest = Integer.MAX_VALUE; 
        int closeSum = 0;  
        
        Arrays.sort(nums);

        for(int i = 0; i < n-2; i++){
            
            if(i > 0 && nums[i]==nums[i-1]) continue; 

            int left = i+1, right = n-1; 

            while(left < right){
                int sum = nums[i]+nums[left]+nums[right]; 
                int diff = Math.abs(sum-target);  // I written this line of code all by myself,my thinking got so great here.  
                if(sum==target) return sum; 
                else if(sum < target) left++; 
                else if(sum > target) right--; 
                if(diff < closest){
                    closest = diff; 
                    closeSum = sum;
                }


            }
        }

        return closeSum; 

    }
}