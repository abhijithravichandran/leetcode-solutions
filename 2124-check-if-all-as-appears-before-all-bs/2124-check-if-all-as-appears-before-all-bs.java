class Solution {
    public boolean checkString(String s) {
        int firstB = -1; 

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='b') {
                firstB = i;
                break; 
            }
        }
        if(firstB==-1) return true; 

        for(int i = firstB+1; i < s.length();i++){
            if(s.charAt(i)=='a')return false; 
        }
        return true; 
    }
}