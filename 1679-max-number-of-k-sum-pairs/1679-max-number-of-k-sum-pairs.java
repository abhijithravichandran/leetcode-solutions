class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int op = 0; 
        for(int i: nums){
            int diff = k-i; 

            if(hash.containsKey(diff)){
                op++; 
                hash.put(diff,hash.get(diff)-1);
                if(hash.get(diff) <= 0) hash.remove(diff);
            }
            else  hash.put(i,hash.getOrDefault(i,0)+1);
        
        }

        return op; 
    }
}