class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];

        int ind = s.indexOf(c);

        // if(ind==-1) return answer; 

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch==c){
                ind = i;  
            }
            int diff = Math.abs(ind-i);
            answer[i] = diff; 
        }  

        int least = Integer.MAX_VALUE; 
        for(int i = n-1; i >= 0; i--){
            char ch = s.charAt(i);

            if(ch==c){
                least = i; 
            }

            if(least-i < answer[i]) answer[i] = least-i; 
        } 

        return answer; 
    }
}