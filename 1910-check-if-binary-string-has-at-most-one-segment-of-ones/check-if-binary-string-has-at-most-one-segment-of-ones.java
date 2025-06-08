class Solution {
    public boolean checkOnesSegment(String s) {
        // boolean foundZero = false;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == '0' && s.charAt(i+1)=='1') return false; //{
            //     foundZero = true;  // Mark that we've found a '0'
            // } else if (foundZero) {  // If we find a '1' after a '0'
            //     return false;      // '1's are not contiguous
            // }
        }
        return true;  // All '1's are contiguous
    }
}