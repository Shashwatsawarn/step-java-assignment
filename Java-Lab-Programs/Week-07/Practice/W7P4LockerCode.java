public class W7P4LockerCode {
    static class Locker {
        private String code;
        private final int lockerNumber;
        Locker(int number, String code) { lockerNumber = number; this.code = code; }
        boolean changeCode(String oldCode, String newCode) {
            if (code.equals(oldCode)) { code = newCode; return true; }
            return false;
        }
    }
    public static void main(String[] args) {
        Locker l = new Locker(101, "1234");
        System.out.println(l.changeCode("1234", "5678") ? "success" : "rejected");
        System.out.println(l.changeCode("0000", "9999") ? "success" : "rejected");
    }
}
