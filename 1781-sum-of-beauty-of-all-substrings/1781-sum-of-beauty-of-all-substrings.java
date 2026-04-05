class Solution {
    public int beautySum(String s) {
        
        int n = s.length(), sum = 0; 

        for(int i = 0; i < n; i++){
            int curMax = 0, curMin = Integer.MAX_VALUE; 
            HashMap<Character,Integer> hash = new HashMap<>();
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for(int j = i; j < n; j ++){
                char ch = s.charAt(j);

                if(hash.containsKey(ch)){
                    minHeap.remove(hash.get(ch));
                    hash.put(ch,hash.get(ch)+1);
                }
                else{
                    hash.put(ch,1);
                }
                minHeap.add(hash.get(ch));

                if(hash.get(ch) >= curMax) curMax = hash.get(ch);
                if(hash.size() >= 2) curMin = minHeap.peek();

                if(curMin != Integer.MAX_VALUE) sum += (curMax-curMin);

            }
        }
        return sum; 
    }
}