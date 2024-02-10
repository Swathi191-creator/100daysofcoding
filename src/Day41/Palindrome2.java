package Day41;

class Palindrome2 {
    // Method to check if a string can become a palindrome by removing at most one character
    public boolean validPalindrome(String s) {
        // Initialize two pointers to traverse the string from start and end
        int i = 0;
        int j = s.length() - 1;

        // Iterate until the pointers meet or cross each other
        while (i < j) {
            // Check if characters at the current positions are unequal
            if (s.charAt(i) != s.charAt(j)) {
                // If unequal, attempt to create a palindrome by removing either character at i+1 or j-1
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            // Move the pointers towards each other
            i++;
            j--;
        }

        // If the loop completes without finding any unequal characters, return true indicating a valid palindrome
        return true;
    }

    // Helper method to check if a substring is a palindrome
    public boolean isPalindrome(String s, int start, int end) {
        // Iterate until the pointers meet or cross each other
        while (start < end) {
            // Check if characters at the current positions are unequal
            if (s.charAt(start) != s.charAt(end)) {
                // If unequal, the substring is not a palindrome, return false
                return false;
            }
            // Move the pointers towards each other
            start++;
            end--;
        }
        // If the loop completes without finding any unequal characters, return true indicating a palindrome
        return true;
    }
}
