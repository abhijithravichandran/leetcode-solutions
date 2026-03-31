class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length; 

        int len = 0, cnt = 0; 


        for(int i = 2; i < n; i++){
            int third = nums[i-1] + nums[i-2]; 
            if(nums[i]==third){
                if(cnt==0){
                    cnt = 2; 
                }
                else{
                    cnt++; 
                }
            }
            else{
                cnt = 0; 
            }
  
            len = Math.max(len,cnt+1);
        }

        if(len==1) return 2; 

        return len; 

    }
}