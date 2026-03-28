class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        Character[] str = new Character[n];
        HashMap<Character,Integer> hash = new HashMap<>();
        for(int i = 0; i < n; i++){
            str[i] = s.charAt(i);
            hash.put(s.charAt(i),hash.getOrDefault(s.charAt(i),0)+1);
        } 
        Arrays.sort(str);

        Arrays.sort(str, (a,b)->{
            int f1 = hash.get(a);
            int f2 = hash.get(b);

            if(f1!=f2){
                return f2-f1;
            }
            else return 0;
        } );
        char[] res = new char[n];
        for(int i = 0; i < n; i++){
            res[i] = str[i];
         }

         return new String(res);
    }
}