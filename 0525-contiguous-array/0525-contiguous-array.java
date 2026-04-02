class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,-1);

        int prefix = 0, maxLen = 0; 

        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0) prefix -= 1;
            else prefix +=1; 

            if(hash.containsKey(prefix)){
                maxLen = Math.max(i-hash.get(prefix), maxLen);
            }
            else{
                hash.put(prefix,i);
            }
        }

        return maxLen; 
    }
}