class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map =  new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            map.put(cur,map.getOrDefault(cur,0)+1);
        }
        int n = nums.length/3; 
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry :  map.entrySet()){
            if(entry.getValue() > n) list.add(entry.getKey());
        }
        return list; 
    }
}
