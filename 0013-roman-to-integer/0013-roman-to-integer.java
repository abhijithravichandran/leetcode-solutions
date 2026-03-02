class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int sum = 0; 

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            int val = value(ch);
            if(i < n-1 && val < value(s.charAt(i+1))){
                sum -= val;
            }
            else{
                sum += val; 
            }
        }

        return sum; 
    }
    public int value(char ch){
        if(ch=='I') return 1; 
        else if(ch=='V') return 5; 
        else if(ch=='X') return 10; 
        else if(ch=='L') return 50;
        else if(ch=='C') return 100; 
        else if(ch=='D') return 500;
        return 1000;


    }
}