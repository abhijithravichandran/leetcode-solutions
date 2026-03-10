class Solution {
    public int minDeletion(String s, int k) {
        int[] charFreq = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            charFreq[ch-'a']++; 
        }

        int minDel = 0; 
        Arrays.sort(charFreq);
        for(int i = 0; i < 26-k; i++){
            minDel += charFreq[i];
        }

        return minDel; 
    }
}