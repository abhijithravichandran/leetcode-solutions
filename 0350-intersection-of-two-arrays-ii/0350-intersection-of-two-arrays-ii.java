class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0; 
        int n = nums1.length, m = nums2.length; 

        while(i < n && j < m){
            int left = nums1[i];
            int right = nums2[j];

            if(left < right){
                i++; 
            }
            else if(right < left){
                j++; 
            }
            else{
                res.add(left);
                i++; 
                j++;
            }
            
        }

        int[] result = new int[res.size()];
        for(int k = 0; k < res.size();k++){
            result[k] = res.get(k);
        } 
        return result; 
    }
}