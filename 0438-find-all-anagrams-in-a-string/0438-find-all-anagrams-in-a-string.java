class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int n = s.length();
        int r = 0, l = 0; 
        HashMap<Character,Integer> hash = new HashMap<>();
        int m = p.length();
        for(int i = 0; i < m;i++){
            char ch = p.charAt(i);
            hash.put(ch,hash.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> temp = new HashMap<>();
        while(r < n){
            char ch = s.charAt(r);
            

            int curLen = r-l+1;
            temp.put(ch,temp.getOrDefault(ch,0)+1);

            
            if(r-l+1 > m){
                int cur = r-l+1; 
                while(cur > m){
                    char c = s.charAt(l);
                    temp.put(c,temp.get(c)-1);
                    if(temp.get(c)==0) temp.remove(c);
                    l++;
                    cur = r-l+1;
                }
            }
            curLen = r-l+1;             

            if(curLen==m){
                if(hash.equals(temp)){
                    res.add(l);
                }
                
            }
            r++; 
        }   
        return res; 
    }
}