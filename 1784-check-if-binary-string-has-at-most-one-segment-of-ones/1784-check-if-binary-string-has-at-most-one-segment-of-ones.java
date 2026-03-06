class Solution {
    public boolean checkOnesSegment(String s) {
        int  n = s.length();
        if(n==1 && s.charAt(0)=='1') return true; 
        boolean zero = false; 
        for(int i = 1; i < n; i++){
            char ch = s.charAt(i);
            if(ch=='0') zero = true; 
            if(zero && ch=='1') return false; 
        }
        return true; 
    }
}