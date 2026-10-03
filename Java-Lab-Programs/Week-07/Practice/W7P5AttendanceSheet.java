public class W7P5AttendanceSheet {
    static class AttendanceSheet {
        private final String[] names;
        private int count = 0;
        AttendanceSheet(int size) { names = new String[size]; }
        boolean isPresent(String name) {
            for (int i = 0; i < count; i++) if (names[i].equals(name)) return true;
            return false;
        }
        void markPresent(String name) {
            if (!isPresent(name) && count < names.length) names[count++] = name;
        }
        int getPresentCount() { return count; }
    }
    public static void main(String[] args) {
        AttendanceSheet s = new AttendanceSheet(30);
        s.markPresent("Ana"); s.markPresent("Ben"); s.markPresent("Ana");
        System.out.println(s.getPresentCount());
        System.out.println(s.isPresent("Ben"));
    }
}
