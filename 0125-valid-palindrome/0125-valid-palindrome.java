class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        s = new String(sb);
        return check(s,0,s.length()-1);
    }

    public boolean check(String s, int l, int r){
        if(l >= r) return true; 

        if(s.charAt(l)!=s.charAt(r)) return false; 
        return check(s,l+1,r-1);
    }
}