class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();

        int patternLen = pattern.length();

        char[] patterns = pattern.toCharArray();
        String[] words = s.split(" ");

        if(patterns.length!=words.length) return false; 

        for(int i = 0; i < patternLen; i++){

            char letter = patterns[i];
            String word = words[i];

            if(map1.containsKey(letter)){
                if(!map1.get(letter).equals(word)) return false; 
            }
            else {
                map1.put(letter,word);
            }

            if(map2.containsKey(word)){
                if(map2.get(word)!=letter) return false; 
            }
            else {
                map2.put(word,letter);
            }

        }
        return true; 

      
    }
}