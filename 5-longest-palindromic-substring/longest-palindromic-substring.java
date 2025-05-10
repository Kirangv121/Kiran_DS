class Solution {
    public String longestPalindrome(String s) {
        
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;
        int sl= s.length();

        for (int i = 0; i < sl ; i++) {
            // Check for odd-length palindrome
            int len1 = expandAroundCenter(s, i, i);
            // Check for even-length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            // Update longest if found longer one
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    // Helper function to expand from the center
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Length of the palindrome is right - left - 1
        return right - left - 1;
    }

        
    }
