class Palindrome {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int originalNum = x;
        int reverseNum = 0;

        while (x > 0) {
            reverseNum = reverseNum * 10 + x % 10;
            x = x / 10;
        }

        // Check if the reversed number is equal to the original number
        return originalNum == reverseNum;
    }
}
