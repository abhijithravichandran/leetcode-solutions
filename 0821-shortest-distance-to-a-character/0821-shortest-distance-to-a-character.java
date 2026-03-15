class Solution {
    public int[] shortestToChar(String s, char c) {
        int ind = s.indexOf(c);
        int n =s.length();

        int[] answer = new int[n];

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i); 
            if(ch==c) ind = i; 
            int diff = Math.abs(i-ind);

            answer[i] = diff; 
        }
        int least = Integer.MAX_VALUE; 
        for(int i = n-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch==c) least = i; 
            if(least-i <  answer[i])  answer[i] = least-i; 
        }

        return answer; 
    }
}