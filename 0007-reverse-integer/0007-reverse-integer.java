class Solution {
    public int reverse(int x) {
        int reverseInt;
        if(x < 0){
            reverseInt = -1 *  rev(x * -1);
            return reverseInt;
        }
        return rev(x);
        

    }
    public static int rev(int x){
        int rev = 0;
        while(x != 0){
            int temp = x %10;
            x = x/10;

            if((rev > Integer.MAX_VALUE / 10) || (rev==Integer.MAX_VALUE/10 && temp > 7)) return 0; 
            if((rev < Integer.MIN_VALUE / 10) || (rev==Integer.MIN_VALUE / 10 && temp < -8)) return 0; 

            rev = rev * 10 + temp;
        }
        return rev; 
    }
}