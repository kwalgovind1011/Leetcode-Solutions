class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0;
        int left = 0;
        boolean[] seen = new boolean[128]; // ASCII chars
        
        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            while (seen[c]) {
                seen[s.charAt(left)] = false;
                left++;
            }
            seen[c] = true;
            maxlen = Math.max(maxlen, right - left + 1);
        }
        
        return maxlen;
    }
}