class Solution {
    public String maxValue(String n, int x) {
        if (n.charAt(0) == '-') {
            int p = n.length();
            for (int i = 1; i < n.length(); i++) {
                int d = n.charAt(i) - '0';
                if (d > x) {

                    p = i;
                    break;
                }
            }
            n = n.substring(0, p) + x + "" + n.substring(p);

        } else {
            int p = n.length();
            for (int i = 0; i < n.length(); i++) {
                int d = n.charAt(i) - '0';
                if (x > d) {
                    p = i;
                    break;
                }
            }

            n = n.substring(0, p) + x + "" + n.substring(p);
        }
        return n;
    }
}