class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0, len = stones.length(); 
        HashSet<Character> seen = new HashSet<>();
        for(int i = 0; i < jewels.length(); i++){
            char ch = jewels.charAt(i);
            seen.add(ch);
        }
        for(int i = 0; i < len; i++){
            char ch = stones.charAt(i);
            if(seen.contains(ch))  count++; 
        }
        return count; 
    }
}