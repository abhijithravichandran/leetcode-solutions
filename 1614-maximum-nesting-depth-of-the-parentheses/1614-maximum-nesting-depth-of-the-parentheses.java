class Solution {
    public int maxDepth(String s) {
        int maximum = 0; 

        int cnt = 0; 
        for(char ch: s.toCharArray()){
            if(ch=='(') cnt++; 
            else if(ch==')') cnt--; 

            maximum = Math.max(cnt,maximum);
        }

        return maximum; 
    }
}