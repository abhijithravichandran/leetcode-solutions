class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hash = new HashMap<>();

        Character[] str = new Character[s.length()];

        

        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            str[i] = ch; 
            hash.put(ch,hash.getOrDefault(ch,0)+1);
        }

        Arrays.sort(str);

        Arrays.sort(str, (a,b)->{
            int f1 = hash.get(a);
            int f2 = hash.get(b);

            if(f1!=f2){
                return f2-f1;
            }
            else return 0; 
        });

        char[] res = new char[s.length()];

        for(int i= 0; i < res.length; i++){
            res[i] = str[i];
        }

        return new String(res);

    }
}