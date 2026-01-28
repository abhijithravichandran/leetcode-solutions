class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length; 
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            map.put(cur, map.getOrDefault(cur,0)+1);
        }
        int res = 0; 

        for(int each: map.keySet()){
            if(map.get(each)==1){
                res = each; 
                break; 
            } 
        }
        return res; 
    }
}