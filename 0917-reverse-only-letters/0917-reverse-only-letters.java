class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int n = s.length();

        int i = 0, j = n-1; 

        while(i <= j){
            char ch = arr[i];
            if(ch >= 'a' && ch <= 'z' || ch >='A' && ch <= 'Z'){
                
                char ch2 = arr[j];
                if(ch2 >= 'a' && ch2 <= 'z' || ch2 >='A' && ch2 <= 'Z'){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                    i++; 
                    j--; 
                }
                else{
                    j--; 
                }
            }
            else{
                i++; 
            }
        }

        return String.valueOf(arr);
    }
}