class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0) return 0; 
        String[] arr = s.trim().split(" ");
        int len = arr.length-1; 
        return arr[len].length();
    }
}