class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) return s;
        int start = 0, maxLen = 1;
        for (int i = 1; i < n; i++) {
            int l = i - 1, r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                int len = r - l + 1;
                if (len > maxLen) {
                    maxLen = len;
                    start = l;
                }
                l--;
                r++;
            }
            l = i - 1;
            r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                int len = r - l + 1;
                if (len > maxLen) {
                    maxLen = len;
                    start = l;
                }
                l--;
                r++;
            }
        }
        return s.substring(start, start + maxLen);
    }
}
