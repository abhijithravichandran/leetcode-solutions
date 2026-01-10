class Solution {
    public int minDeletion(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int sum = s.length(); 
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            list.add(entry.getValue());
            
        }
        Collections.sort(list, Collections.reverseOrder());
        if(map.size() < k) return 0; 
        for(int i = 0; i < k; i++){
            sum -= list.get(i);
        }
        return sum; 
        
    }
}