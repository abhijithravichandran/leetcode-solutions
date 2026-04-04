class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l = 0, n = s1.length();
        HashMap<Character, Integer> hash = new HashMap<>();
        for(int i = 0; i < s1.length();i++){
            char ch = s1.charAt(i);
            hash.put(ch,hash.getOrDefault(ch,0)+1);
        }

        HashMap<Character,Integer> curHash = new HashMap<>();

        for(int r = 0; r < s2.length();r++){

            char ch = s2.charAt(r);

            curHash.put(ch,curHash.getOrDefault(ch,0)+1);

            int window = r-l+1;

            while(window > n && l <= r){
                char c = s2.charAt(l);
                curHash.put(c,curHash.get(c)-1);
                if(curHash.get(c)==0) curHash.remove(c);
                l++; 
                window = r-l+1; 
            }

            if(hash.equals(curHash)) return true; 

            
        }

        return false; 
    }


}