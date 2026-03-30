class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();

        int ind = 0; 

        for(int i = n-1;i >= 0; i--){
            int number = (int) (num.charAt(i)-'0');
            if(number%2!=0){
                return num.substring(0,i+1);
            }
        }

        return "";
    }
}