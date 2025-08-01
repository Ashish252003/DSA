class Solution {
    public boolean isPalindrome(String s) {
        String cleanedString = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                cleanedString += Character.toLowerCase(c);
            }
        }

        String reversedString = "";
        for (int i = cleanedString.length() - 1; i >= 0; i--) {
            reversedString += cleanedString.charAt(i);
        }

        return cleanedString.equals(reversedString);
    }
}