class Solution {
    public String defangIPaddr(String address) {
        // String res = "";
        StringBuilder res = new StringBuilder();
        int len = address.length();

        for(int i = 0; i < len; i++){
            char ch = address.charAt(i);
            if(ch=='.'){
                res.append("[.]");
            }
            else res.append(ch);  
        }
        return res.toString(); 
    }
}