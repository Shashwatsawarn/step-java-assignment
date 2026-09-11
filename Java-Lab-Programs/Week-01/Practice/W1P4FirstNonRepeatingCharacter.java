public class W1P4FirstNonRepeatingCharacter {
    static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) frequency[text.charAt(i)]++;
        for (int i = 0; i < text.length(); i++) if (frequency[text.charAt(i)] == 1) return text.charAt(i);
        return '\0';
    }
    public static void main(String[] args) {
        char answer = findFirstNonRepeatingChar("swiss");
        System.out.println(answer == '\0' ? "No Non-Repeating Character Found" : "First Non-Repeating Character: '" + answer + "'");
    }
}
