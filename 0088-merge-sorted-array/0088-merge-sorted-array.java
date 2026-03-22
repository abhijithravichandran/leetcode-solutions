class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = n + m; 
        int i = m-1, j = n-1; 
        int k = len-1; 

        while(i >= 0 && j >= 0){
            int left = nums1[i];
            int right = nums2[j];
            if(left > right){
                nums1[k] = left; 
                i--; 
            }
            else{
                nums1[k] = right; 
                j--; 
            }
            k--; 
        }

        while(i >= 0){
            nums1[k--] = nums1[i--];
        }

        while(j >= 0){
            nums1[k--] = nums2[j--];
        }


    }
}