class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();

        // Store index of each restaurant in list1
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        int minSum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();

        // Traverse list2
        for (int i = 0; i < list2.length; i++) {
            String str = list2[i];

            if (map.containsKey(str)) {
                int sum = i + map.get(str);

                // Found smaller index sum
                if (sum < minSum) {
                    minSum = sum;
                    result.clear();
                    result.add(str);
                }
                // Found another string with same minimum sum
                else if (sum == minSum) {
                    result.add(str);
                }
            }
        }

        return result.toArray(new String[0]);

    }
}