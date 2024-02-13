package Day43;

import java.util.Arrays;

class Solution {
    // Method to check if two strings are anagrams of each other
    public boolean isAnagram(String s, String t) {
        // Convert strings to character arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sort character arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare sorted arrays to check if strings are anagrams
        return Arrays.equals(sArray, tArray);
    }
}

