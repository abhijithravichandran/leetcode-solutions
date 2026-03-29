class Solution {
    public List<String> commonChars(String[] words) {
        int n = words.length;
        int[] global = new int[26];

        for(int i = 0; i < words[0].length();i++){
            char ch  = words[0].charAt(i);
            global[ch-'a']++;
        }

        for(int i = 1; i < n; i++){
            
            int[] temp = new int[26];
            for(int j = 0; j < words[i].length();j++){
                char ch = words[i].charAt(j);
                temp[ch-'a']++;
            }

            for(int j = 0; j < 26; j++){
                global[j] = Math.min(global[j],temp[j]);  //This is the amazing line ever. 
            }
        }

        List<String> res = new ArrayList<>();

        for(int i = 0; i < 26; i++){
            if(global[i] ==1) res.add(String.valueOf((char)('a'+i)));
            else{
                while(global[i] > 0){
                    global[i]--;
                    res.add(String.valueOf((char)('a'+i)));
                }
            }
        }

        return res; 


    }
}