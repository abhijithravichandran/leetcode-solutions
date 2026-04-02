class Solution {
    public String removeOuterParentheses(String s) {
        int bal = 0, n = s.length();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(ch=='('){
                if(bal > 0) sb.append(ch);
                bal++; 
            }
            else if(ch==')'){
                bal--; 
                if(bal > 0) sb.append(ch);
            }
        }

        return sb.toString();
    }
}