class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int n = words.length;

        Set<Character> map = new HashSet<>();
        for(char ch: allowed.toCharArray()){
            map.add(ch);
        }
        int cnt = 0; 

        for(int i = 0; i < n; i++){
            String str = words[i];
            boolean consistent = true; 
            for(int j = 0; j < str.length();j++){
                char ch = str.charAt(j);
                if(!map.contains(ch)) {
                    consistent = false; 
                    break; 
                }
            }
            if(consistent) cnt++;
        }
        return cnt; 
    }
}