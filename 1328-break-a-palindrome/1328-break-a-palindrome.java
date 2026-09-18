class Solution {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if(n==1) return "";
        char c = 'a';
        
        StringBuilder sb = new StringBuilder(palindrome);

        for(int i = 0; i < n/2; i++){
            char ch = palindrome.charAt(i);
            if(ch!=c){
                sb.setCharAt(i,c++);
                break; 
            }
        }

        if(c=='a'){
            if(sb.charAt(n-1)=='a'){
                c++; 
                sb.setCharAt(n-1,c);
            }
        }

        return sb.toString();
    }
}