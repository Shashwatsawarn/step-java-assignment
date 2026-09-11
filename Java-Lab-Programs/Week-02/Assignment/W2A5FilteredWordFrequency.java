import java.util.*;

public class W2A5FilteredWordFrequency {
    static void printFilteredWordFrequency(String feedback) {
        String cleaned = feedback.toLowerCase().replace(".", "").replace(",", "");
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};
        Map<String, Integer> count = new HashMap<>();
        for (String word : cleaned.split("\\s+")) {
            boolean stop = false; for (String s : stopWords) if (s.equals(word)) stop = true;
            if (!stop && !word.isEmpty()) count.put(word, count.getOrDefault(word, 0) + 1);
        }
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(count.entrySet());
        entries.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        for (Map.Entry<String, Integer> entry : entries) System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    public static void main(String[] args) { printFilteredWordFrequency("The mentor was great, the session was great and clear."); }
}
