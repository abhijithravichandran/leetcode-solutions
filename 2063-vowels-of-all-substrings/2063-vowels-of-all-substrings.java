class Solution {
    public long countVowels(String word) {
        long count = 0; 
        long len = word.length();

        for(int i = 0; i < len; i++){
            char ch = word.charAt(i);
            if(ch=='a' || ch=='e' || ch == 'i' || ch == 'o' || ch=='u'){
                count += ((i+1) * (len-i)); 
            }
        }
        return count; 
    }
}