class Solution {
    public int countSegments(String s) {
        int n = s.length(), len = 0;

        for(int  i = 0; i < n;i++){
            char ch = s.charAt(i);
            if(i-1 >=0 && ch==' ' && s.charAt(i-1)!=' '){
                len++; 
            }
            else if(i==n-1 && ch!=' '){
                len++; 
            }
        }
        return len; 
    }
}