class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        String[] str = paragraph.split("\\s+");
        HashMap<String,Integer> bannedWords = new HashMap<>();
        for(int i = 0; i < banned.length; i++){
            bannedWords.put(banned[i],bannedWords.getOrDefault(banned[i],0)+1);
        }

        HashMap<String,Integer> hash = new HashMap<>();
        int max = 0; 
        String maxStr = "";

        for(String each: str){
            if(bannedWords.containsKey((each))) continue; 
            if(!each.equals("!") && !each.equals("?") && !each.equals(",") && 
            !each.equals(";") && !each.equals(".") && !each.equals(" ")){
                hash.put(each,hash.getOrDefault(each,0)+1);
                if(hash.get(each) > max){
                    max = hash.get(each);
                    maxStr = each; 
                }
            }
        }


        return maxStr; 
    }

    
}