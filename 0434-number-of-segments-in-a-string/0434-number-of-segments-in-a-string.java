class Solution {
    public int countSegments(String s) {
        if(s.length()==0) return 0; 
        int len = 0; 
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            if(i-1 >= 0 && ch==' ' && s.charAt(i-1)!=' '){
                len++; 
            }
            else if(i==s.length()-1 && ch!=' ') len++; 

        }
        return len;
    }
}