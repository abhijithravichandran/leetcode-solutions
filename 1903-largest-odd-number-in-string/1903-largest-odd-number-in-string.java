class Solution {
    public String largestOddNumber(String num) {
        int i = num.length()-1; 

        while(i >= 0){
            char ch = num.charAt(i);
            int n = (int)(ch-'0');

            if(n%2!=0) break; 
            i--; 
        }

        if(i==-1) return "";
        
        return num.substring(0,i+1);
    }
}