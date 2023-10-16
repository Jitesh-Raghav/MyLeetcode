class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int len = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    count++;
                }
                if (count == k) {
                    String ss = s.substring(i, j + 1);
                    if (ss.length() < len || (ss.length() == len && ss.compareTo(ans) < 0)) {
                        len = ss.length();
                        ans = ss;
                    }
                    break;
                }
            }
        }
        return ans;
    }
}