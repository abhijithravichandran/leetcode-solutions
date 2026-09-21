class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        if(n==0) return 2; 
        int cnt = 0; 

        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            
            if(c==')'){
                if(stack.isEmpty()){
                    cnt++; 
                }
                else{
                    stack.pop();
                }
            }
            else{
                stack.push(c);
            }
        }

        cnt += stack.size();

        return cnt; 
    }
}