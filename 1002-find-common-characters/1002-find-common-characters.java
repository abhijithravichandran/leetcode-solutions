class Solution {
    public List<String> commonChars(String[] words) {
        int n = words.length;
        int[] global = new int[26];

        for(int i = 0; i < words[0].length();i++){
            char ch = words[0].charAt(i);
            global[ch-'a']++; 
        }

        for(int i = 1; i < n; i++){
            int[] current = new int[26];
            for(char c: words[i].toCharArray()){
                current[c-'a']++; 
            }

            for(int j = 0; j < 26; j++){
                global[j] = Math.min(global[j],current[j]);
            }
        }

        List<String> res =new ArrayList<>();
        for(int i = 0; i < 26; i++){
            if(global[i]==1) res.add(""+(char)(i+'a'));
            else if(global[i] > 1){
                for(int j = 0; j < global[i];j++){
                    res.add(""+(char)(i+'a'));
                }
            }
        }

        return res; 
    }
}