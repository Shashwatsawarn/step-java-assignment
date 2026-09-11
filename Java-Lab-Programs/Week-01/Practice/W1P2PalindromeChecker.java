public class W1P2PalindromeChecker {
    static boolean isPalindromeIterative(String text) {
        for (int left = 0, right = text.length() - 1; left < right; left++, right--)
            if (text.charAt(left) != text.charAt(right)) return false;
        return true;
    }
    static boolean isPalindromeRecursive(String text) { return check(text, 0, text.length() - 1); }
    static boolean check(String text, int left, int right) {
        if (left >= right) return true;
        return text.charAt(left) == text.charAt(right) && check(text, left + 1, right - 1);
    }
    static boolean isPalindromeArrayReversal(String text) {
        char[] chars = text.toCharArray();
        StringBuilder reverse = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) reverse.append(chars[i]);
        return text.equals(reverse.toString());
    }
    public static void main(String[] args) {
        String text = "madam";
        System.out.println("Iterative: " + (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Recursive: " + (isPalindromeRecursive(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Array Reversal: " + (isPalindromeArrayReversal(text) ? "Palindrome" : "Not Palindrome"));
    }
}
