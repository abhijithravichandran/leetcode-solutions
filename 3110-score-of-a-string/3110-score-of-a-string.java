class Solution {
    public int scoreOfString(String s) {
        int sum = 0; 
        if(s.length() < 1) return s.charAt(0);

        for(int i = 0; i < s.length()-1; i++){
            char ch = s.charAt(i);
            char ch2 = s.charAt(i+1);
            sum += Math.abs(ch-ch2);
        }
        return sum; 
    }
}