class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length; 
        int max = 0; 

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i <n; i++){
            int cur = nums[i];
            map.put(cur,map.getOrDefault(cur,0)+1);
            max = Math.max(map.get(cur),max);

        }
        int count = 0; 
        for(int each: map.keySet()){
            if(map.get(each)==max) count+= map.get(each); 
        }

        return count; 


    }
}