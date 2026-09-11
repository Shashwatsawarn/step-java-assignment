public class W5A4MatchDayGridAnalyzer {
    private static double rowAverage(int[] row) {
        int sum = 0; for (int runs : row) sum += runs;
        return row.length == 0 ? 0 : sum * 1.0 / row.length;
    }
    static String classifyMatches(int[][] runsPerOver, int threshold) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < runsPerOver.length; i++) {
            if (i > 0) answer.append(" | ");
            answer.append("Match ").append(i).append(": ").append(rowAverage(runsPerOver[i]) >= threshold ? "Power Surge" : "Normal");
        }
        return answer.toString();
    }
    public static void main(String[] args) { System.out.println(classifyMatches(new int[][]{{4, 6, 8}, {10, 12, 14}, {2, 3, 1}}, 8)); }
}
