class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] mischievous = new int[2];
        boolean[] status = new boolean[nums.length];
        int j = 0; 
        for(int i = 0; i < nums.length; i++){
            if(status[nums[i]]==true){
                 mischievous[j]=nums[i];
                 j++;
                 }
            if(j==2) break; 
            status[nums[i]] = true; 
        }
        return mischievous; 
    }
}