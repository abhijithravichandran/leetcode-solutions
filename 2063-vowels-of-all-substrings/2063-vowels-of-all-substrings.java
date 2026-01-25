class Solution {
    public long countVowels(String word) {
        long n = word.length();
        long sum = 0; 
        for(int i = 0; i < n;i++){
            char ch = word.charAt(i);

            if(ch=='a' || ch=='i' || ch=='o' || ch=='e' || ch=='u'){
                sum += ((i+1) * (n-i));
            }
        }
        return sum;
    }
}