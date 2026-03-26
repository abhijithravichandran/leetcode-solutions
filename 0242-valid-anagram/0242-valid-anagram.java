class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length(), n2 = t.length();
        if(n!=n2) return false; 

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch: t.toCharArray()){

            if(!map.containsKey(ch)) return false; 
            else map.put(ch,map.get(ch)-1);

            if(map.get(ch) < 0) return false; 
        }

        return true; 
    }
}