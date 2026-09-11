public class W5P4SeatingGridOptimizer {
    private static double rowAverage(int[] row) {
        int sum = 0; for (int score : row) sum += score;
        return row.length == 0 ? 0 : sum * 1.0 / row.length;
    }
    static String classifyRows(int[][] seatingScores, int threshold) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < seatingScores.length; i++) {
            if (i > 0) answer.append(" | ");
            answer.append("Row ").append(i).append(": ").append(rowAverage(seatingScores[i]) < threshold ? "Quiet Zone" : "Buzzing Zone");
        }
        return answer.toString();
    }
    public static void main(String[] args) { System.out.println(classifyRows(new int[][]{{40, 50, 45}, {85, 90, 95}, {30, 20, 25}}, 60)); }
}
