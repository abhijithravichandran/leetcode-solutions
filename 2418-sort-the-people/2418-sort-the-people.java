class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> hash = new HashMap<>();
        int n = names.length;
        for(int i = 0; i < n; i++){
            hash.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i = 0; i < n; i++){
            names[i] = hash.get(heights[n-i-1]);
        }
        return names; 
    }
}