class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
      //  int k = n;
        int l = nums1.length;
        int i = 0,j = 0;
        while(i<m+j&& j<n){
            if(nums1[i]>nums2[j])
            {
                for(int s = m+j;s>i;s--)nums1[s]=nums1[s-1];
                //k-=1;
                nums1[i] = nums2[j];
                j++;
            }
            else i++;
        }
        while(j<n){
            nums1[i] = nums2[j];
            i++;
            j++;
        }
    }
}