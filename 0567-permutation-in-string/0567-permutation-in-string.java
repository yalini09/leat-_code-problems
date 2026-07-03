class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if (n > m) return false;
        
        int[] count = new int[26];
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }
        
        int left = 0;
        for (int right = 0; right < m; right++) {
            count[s2.charAt(right) - 'a']--;
            
            // if window exceeds size n, shrink from left
            if (right - left + 1 > n) {
                count[s2.charAt(left) - 'a']++;
                left++;
            }
            if (right - left + 1 == n && allZero(count)) {
                return true;
            }
        }
        
        return false;
    }
    
    private boolean allZero(int[] count) {
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }
} 
