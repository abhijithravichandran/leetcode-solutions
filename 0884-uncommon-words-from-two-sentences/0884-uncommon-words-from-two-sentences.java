class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

       ArrayList<String> list = new ArrayList<>();

        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        int n1 = str1.length; 
        int n2 = str2.length; 

        for(int i= 0; i < n1; i++){
            String str = str1[i];
            map1.put(str,map1.getOrDefault(str,0)+1);
        }

        for(int i = 0; i < n2; i++){
            String str = str2[i];
            map2.put(str,map2.getOrDefault(str,0)+1);
        }


        for(String word: map1.keySet()){
            if(!map2.containsKey(word) && map1.get(word)==1){

                list.add(word);

            }
        }

        for(String word: map2.keySet()){
            if(!map1.containsKey(word) && map2.get(word)==1){
                
                list.add(word);
                
            }
        }

        String[] str = new String[list.size()];

        for(int i = 0; i < str.length; i++){
            str[i] = list.get(i);
        }

        return str; 

        

    }
}