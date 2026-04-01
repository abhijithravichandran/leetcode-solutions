class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < n; i++){
            char ch = sb.charAt(0);

            if(goal.equals(sb.toString())){
                return true; 
            }

            sb.deleteCharAt(0);
            sb.append(ch);
        }

        return false; 
    }
}