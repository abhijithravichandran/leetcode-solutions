class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map = new HashSet<Integer>();

        for(int num: nums){
            map.add(num);
        }
        int longest = 0; 
        for(int num: map){
           
            if(!map.contains(num-1)){
                int count = 1; 
                int cur = num; 

                while(map.contains(cur+1)){
                    // map.remove(cur+1);
                    count++;
                    cur++; 
                }

                longest = Math.max(count,longest);
            }
        }
         return longest; 
    } 
}