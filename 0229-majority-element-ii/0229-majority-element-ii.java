class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map =  new HashMap<>();
        int n = nums.length/3; 
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            if(!map.containsKey(cur) || (map.containsKey(cur) && map.get(cur)!=-1))  map.put(cur,map.getOrDefault(cur,0)+1);
            if(map.get(cur)>n){
            map.put(cur,-1);
            list.add(cur);
            }
            if(list.size()==2) break; 
        }
    
        return list; 
    }
}
