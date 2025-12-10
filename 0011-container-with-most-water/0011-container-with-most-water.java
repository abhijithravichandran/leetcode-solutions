class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1; 
        int max1 = 0, l = 0; 
        while(i < j){

            if(height[i] <  height[j]){
                l = j -i; 
                max1 = Math.max(max1, l*height[i]);
                i++; 
            }
            else {
                l = j -i; 
                max1 = Math.max(max1,l*height[j]);
                j--;
            }
        }
        return max1; 


    }
}