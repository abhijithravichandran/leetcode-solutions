class Solution {
    public String reverseWords(String s) {

        s.trim();
        String[] str = s.split(" ");
        int n = str.length;
        String[] str2 = new String[n];

        for(int i = n-1; i>=0 ;i--){
            str2[i] = str[n-i-1];
        }

        StringBuilder sb = new StringBuilder();
        for(String c: str2){
            if(c.equals("")) continue; 
            sb.append(c).append(" ");
        }

        String res = sb.toString().trim();
        return res; 

    }
}