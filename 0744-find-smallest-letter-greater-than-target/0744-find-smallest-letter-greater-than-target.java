class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length; 
        if(letters[n-1] < target) return letters[0];

        for(int i = 0; i < letters.length; i++){
            if(letters[i] > target) {
                return letters[i]; 
        }
    }
    return letters[0];
}
}