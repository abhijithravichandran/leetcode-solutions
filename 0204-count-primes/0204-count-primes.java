class Solution {
    public int countPrimes(int n) {
        // Sieve of erathenes 
        if(n==0 || n==1) return 0; 
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes,true);
        primes[0] = false; 
        primes[1] = false; 

        for(int i = 2; i*i <= n; i++){

            if(primes[i]){

                for(int p = i*i; p <= n;p+=i){
                    primes[p] = false; 
                }
            }

        }
        int count = 0; 
        for(int i = 2; i < n; i++){
            if(primes[i]) count++; 
        }
        return count; 
    }
}