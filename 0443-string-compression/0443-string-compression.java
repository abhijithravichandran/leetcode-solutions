class Solution {
    public int compress(char[] chars) {
        int ind = 0;  

        if (chars.length == 1) {
            return 1;
        }

        String s = Character.toString(chars[0]);

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {

                chars[ind++] = s.charAt(0);


                if (s.length() > 1) {
                    String num = Integer.toString(s.length());
                    for (int l = 0; l < num.length(); l++) {
                        chars[ind++] = num.charAt(l);
                    }
                }

                s = "";
            }
            s += chars[i];
        }

        // handle last group (SAME logic as above)
        chars[ind++] = s.charAt(0);
        if (s.length() > 1) {
            String num = Integer.toString(s.length());
            for (int l = 0; l < num.length(); l++) {
                chars[ind++] = num.charAt(l);
            }
        }

        return ind;
    }
}
