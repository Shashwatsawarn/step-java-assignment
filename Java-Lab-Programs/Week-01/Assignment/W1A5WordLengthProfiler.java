public class W1A5WordLengthProfiler {
    static void classifyWordLengths(String review) {
        int shortWords = 0, mediumWords = 0, longWords = 0;
        for (String word : review.trim().split("\\s+")) {
            int length = word.length();
            if (length <= 4) shortWords++; else if (length <= 8) mediumWords++; else longWords++;
        }
        System.out.println("Short: " + shortWords + " | Medium: " + mediumWords + " | Long: " + longWords);
    }
    public static void main(String[] args) { classifyWordLengths("This movie was absolutely fantastic and thrilling"); }
}
