public class W2A2WordReversalEncoder {
    static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" "); StringBuilder answer = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder reverse = new StringBuilder();
            for (int j = words[i].length() - 1; j >= 0; j--) reverse.append(words[i].charAt(j));
            if (i > 0) answer.append(' '); answer.append(reverse);
        }
        return answer.toString();
    }
    public static void main(String[] args) { System.out.println(reverseEachWord("hello club")); }
}
