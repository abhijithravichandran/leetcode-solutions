class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> unions = new HashSet<>();

        int i = 0, j = 0, n = nums1.length, m = nums2.length; 

        while(i < n && j < m){

            if(nums1[i]==nums2[j]){
                unions.add(nums1[i]);
                i++; 
                j++; 
            }
            else if(nums1[i] > nums2[j]){
                j++; 
            }
            else{
                i++; 
            }
        }
        int len = unions.size();
        int[] res = new int[len];

        int k = 0; 
        for(int num: unions){
            res[k++] = num; 
        }

        return res;
    }
}