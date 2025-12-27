class Solution {
    public int lengthOfLastWord(String s) {
        String k = s.trim();
        int n = k.length()-1;
        int len = 0; 
        while(n >=0 && k.charAt(n)!=' '){
            len++; 
            n--; 
        }
        return len;
    }
}