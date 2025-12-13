class Solution {

    public List<String> validateCoupons(
            String[] code,
            String[] businessLine,
            boolean[] isActive) {

        List<List<String>> validCoupons = new ArrayList<>();

        // Step 1: Validate and collect valid coupons
        for (int i = 0; i < code.length; i++) {

            if (!code[i].isEmpty()
                    && code[i].matches("[a-zA-Z0-9_]+")
                    && isActive[i]
                    && check(businessLine[i])) {

                List<String> row = new ArrayList<>();
                row.add(businessLine[i]);
                row.add(code[i]);

                validCoupons.add(row);
            }
        }

        // Step 2: Priority order
        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 1);
        priority.put("grocery", 2);
        priority.put("pharmacy", 3);
        priority.put("restaurant", 4);

        // Step 3: Sort
        validCoupons.sort((a, b) -> {
            int p1 = priority.get(a.get(0));
            int p2 = priority.get(b.get(0));

            if (p1 != p2) {
                return p1 - p2;
            }

            return a.get(1).compareTo(b.get(1));
        });

        // Step 4: Extract only coupon codes
        List<String> res = new ArrayList<>();
        for (List<String> row : validCoupons) {
            res.add(row.get(1));
        }

        return res;
    }

    // Business line validation
    public boolean check(String s) {
        return s.equals("electronics")
                || s.equals("grocery")
                || s.equals("pharmacy")
                || s.equals("restaurant");
    }
}
