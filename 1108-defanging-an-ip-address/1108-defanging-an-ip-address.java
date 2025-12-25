class Solution {
    public String defangIPaddr(String address) {
        String res = "";
        int len = address.length();

        for(int i = 0; i < len; i++){
            char ch = address.charAt(i);
            if(ch=='.'){
                res += "[.]";
            }
            else res += ch;  
        }
        return res; 
    }
}