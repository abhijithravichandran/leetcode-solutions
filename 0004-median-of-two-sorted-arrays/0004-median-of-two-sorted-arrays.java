class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length; 
        int len = n + m; 
        int[] arr = new int[len];

        int i =  0, j = 0, k = 0; 
        while(i < n && j < m){
            if(nums1[i] > nums2[j]){
                arr[k++] = nums2[j++];
            }
            else{
                arr[k++] = nums1[i++];
            }

        }
        while(i < n){
            arr[k++] = nums1[i++];
        }
        while(j < m){
            arr[k++] = nums2[j++];
        }

        if(len%2!=0){
            return arr[len/2];
        }
        else{
            double temp = arr[len/2] + arr[len/2-1];
            return (temp/2);
        }

    }
}