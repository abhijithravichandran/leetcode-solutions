class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int cnt = 0; 
        int i = 0, j = 0; 
        int n = g.length, m = s.length; 
        
        while(i < n && j < m){
            if(g[i] > s[j]) j++; 
            else{
                cnt++; 
                i++; 
                j++; 
            }
        }

        return cnt; 
    }
}