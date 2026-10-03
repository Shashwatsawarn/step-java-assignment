public class W7P2QuizScorecard {
    static class Scorecard {
        private final boolean[] results;
        private int count = 0;
        Scorecard(int questions) { results = new boolean[questions]; }
        void recordAnswer(boolean correct) {
            if (count < results.length) results[count++] = correct;
        }
        int getScore() {
            int score = 0;
            for (int i = 0; i < count; i++) if (results[i]) score++;
            return score;
        }
    }
    public static void main(String[] args) {
        Scorecard s = new Scorecard(4);
        s.recordAnswer(true); s.recordAnswer(true);
        s.recordAnswer(false); s.recordAnswer(true);
        System.out.println(s.getScore());
    }
}
