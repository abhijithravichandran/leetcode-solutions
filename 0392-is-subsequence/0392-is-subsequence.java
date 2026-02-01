class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int n2 = t.length();

        if(n2 < n) return false; 
        int ind = 0; 
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            boolean found = false; 
            while(ind < n2){
                if(ch==t.charAt(ind++)){
                    found = true; 
                    break; 
                }
            }
            if(!found) return false; 
        }

        return true; 
    }
}