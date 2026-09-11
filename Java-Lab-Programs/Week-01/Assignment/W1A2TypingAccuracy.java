public class W1A2TypingAccuracy {
    static void checkTypingAccuracy(String original, String typed) {
        int matched = 0, firstMismatch = -1, length = Math.min(original.length(), typed.length());
        for (int i = 0; i < length; i++) {
            if (original.charAt(i) == typed.charAt(i)) matched++;
            else if (firstMismatch == -1) firstMismatch = i;
        }
        if (original.length() != typed.length() && firstMismatch == -1) firstMismatch = length;
        int total = Math.max(original.length(), typed.length());
        double accuracy = total == 0 ? 100 : matched * 100.0 / total;
        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%", matched, total, accuracy);
        if (firstMismatch == -1) System.out.println(" | No Mismatches");
        else {
            char expected = firstMismatch < original.length() ? original.charAt(firstMismatch) : '-';
            char actual = firstMismatch < typed.length() ? typed.charAt(firstMismatch) : '-';
            System.out.println(" | First Mismatch at position " + (firstMismatch + 1) + " ('" + expected + "' vs '" + actual + "')");
        }
    }
    public static void main(String[] args) { checkTypingAccuracy("hello world", "hello worlt"); }
}
