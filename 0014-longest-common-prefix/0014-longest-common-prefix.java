class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < strs[0].length(); i++){
            for(String each: strs){
                if(i == each.length() || each.charAt(i) != strs[0].charAt(i)){
                    return res.toString(); 
                }
            }
            // res += strs[0].charAt(i);
            res.append(strs[0].charAt(i));
        }
        return res.toString(); 
    }
}