class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length; 

        int i = 0, j = 0; 
        while(i < n && j < m){
            int left = nums1[i];
            int right = nums2[j];
            
            if(left==right) return left; 

            if(nums1[i] > nums2[j]){
                j++; 
            }
            else{
                i++; 
            }

        }


        return -1; 
    }
}