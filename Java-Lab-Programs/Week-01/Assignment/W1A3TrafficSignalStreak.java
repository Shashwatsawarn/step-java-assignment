public class W1A3TrafficSignalStreak {
    static void findLongestStreak(String signalLog) {
        if (signalLog.isEmpty()) { System.out.println("Signal log is empty"); return; }
        char bestColor = signalLog.charAt(0); int best = 1, current = 1;
        for (int i = 1; i < signalLog.length(); i++) {
            current = signalLog.charAt(i) == signalLog.charAt(i - 1) ? current + 1 : 1;
            if (current > best) { best = current; bestColor = signalLog.charAt(i); }
        }
        System.out.println("Longest Streak: '" + bestColor + "' repeated " + best + " times");
    }
    public static void main(String[] args) { findLongestStreak("RRGGGYRR"); }
}
