class Solution {
    public String firstPalindrome(String[] words) {
        int len = words.length;
        boolean status = true; 
        for(int i = 0; i < len; i++){
            if(palindromeCheck(words[i])){
                return words[i];
            }
        }
        return ""; 
    }
    public boolean palindromeCheck(String word){
        int l = 0; 
        int r = word.length()-1;

        while(l < r){
            if(word.charAt(l)!= word.charAt(r)){
                return false; 
            };
            l++; 
            r--; 
        }
        return true; 
    }
}