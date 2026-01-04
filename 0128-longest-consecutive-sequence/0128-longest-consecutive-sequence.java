class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map = new HashSet<>();

        for(int num: nums){
            map.add(num);
        }
        int longest = 0; 
        for(int i=0; i <  nums.length; i++){
            int num = nums[i];
            if(!map.contains(num-1)){
                int count = 1; 
                while(map.contains(num+1)){
                    map.remove(num+1);
                    count++;
                    num +=1; 
                }
                longest = Math.max(count,longest);

            }
        }
         return longest; 
    } 
}