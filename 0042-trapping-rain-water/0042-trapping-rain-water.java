class Solution {
    public int trap(int[] height) {
        int n = height.length; 
        int lmax = height[0];
        int rmax = height[n-1];
        int l = 1, r = n -2; 
        int res = 0; 
        while(l <= r){
            if(lmax <= rmax){
                res += Math.max(0,lmax - height[l]);
                lmax = Math.max(lmax,height[l]);
                l++;
            }
            else {
                res += Math.max(0,rmax - height[r]);
                rmax = Math.max(rmax,height[r]);
                r--;
            }

        }
        return res; 
    }
}