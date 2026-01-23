class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        }
        for(int i = 0; i < nums2.length; i++){
            map2.put(nums2[i], map2.getOrDefault(nums2[i],0)+1);
        }
        int answer1 = 0, answer2 = 0; 
        Set seen = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            int cur = nums1[i];
            if(map2.containsKey(cur) && !seen.contains(cur)){
                answer1 += map1.get(cur);
                answer2 += map2.get(cur);
                seen.add(cur);
            }
        }

        return new int[]{answer1,answer2};
    }
}