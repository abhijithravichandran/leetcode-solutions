class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character,Integer> hash = new HashMap<>();
        int n = s.length(), cnt = 0; 

        if(n < 3) return 0; 
        for(int i = 0; i < 3; i++){
            char ch = s.charAt(i);
            hash.put(ch,hash.getOrDefault(ch,0)+1);
        }

        if(hash.size()==3) cnt++; 

        for(int i = 3; i < n; i++){
            char ch = s.charAt(i-3);
            hash.put(ch,hash.get(ch)-1);
            if( hash.get(ch) <= 0) hash.remove(ch);
            char c = s.charAt(i);
            hash.put(c,hash.getOrDefault(c,0)+1);
            if(hash.size()==3) cnt++; 
        }

        return cnt; 
    }
}