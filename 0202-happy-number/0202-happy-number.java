class Solution {
    public boolean isHappy(int n) {
        
        while(n!=1 && n!=4){
            n = sumOfDigits(n);
        }
        return (n==1); 
    }

    static int sumOfDigits(int x){
        int sum = 0;
        while(x!=0){
            int rem  = x%10; 
            sum += rem*rem;
            x /=10;
        }
        return sum; 
    }
}