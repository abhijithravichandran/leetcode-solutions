class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int num: nums){
            hash.put(num,hash.getOrDefault(num,0)+1);

        }
        Arrays.sort(nums);
        int most = 0, ele = -1; 
        for(int num: nums){
            int freq  = hash.get(num);
            if(freq > most && num%2==0){
                most = freq; 
                ele = num; 
            }
        }
        return ele; 
    }
}