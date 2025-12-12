class Solution {
    public String longestPalindrome(String s) {
        int l =0, r = 1, cnt=0; 
        int len = s.length();
        int max = 0, ind=0; 
 
        String str = "#";
        for(int i = 0; i < len; i++){
            str += s.charAt(i) + "#";
        }
        int new_len = str.length();
        int[] arr = new int[new_len];

        for(int i = 0; i < new_len; i++){
            l = i -1; 
            r = i +1; 
             
            while(l >=0 && r < new_len && str.charAt(l)==str.charAt(r)){
                cnt++; 
                l--;
                r++;
            }
            arr[i] = cnt; 
            if(cnt > max) {
                max = cnt;
                ind =i; 
            }
            cnt = 0; 
        }
    

        int start = ind - max; 
        int end = ind + max; 
        String res = "";
        for(int i = start; i <= end; i++){
            char ch = str.charAt(i);
            if(ch!='#') res+=ch; 
        }
        return res; 
    }
        
}