class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum = 0; 
        if(s.length() < 2) return map.get(s.charAt(0));

        for(int i = 0; i < s.length()-1;i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(map.get(ch1) < map.get(ch2)){
                sum -=  map.get(ch1);
            }
            else{
                sum += map.get(ch1);
            }
        }
        sum += map.get(s.charAt(s.length()-1));
        
        return sum; 

    }
}