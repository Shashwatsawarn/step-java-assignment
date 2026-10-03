public class W7P1PiggyBank {
    static class PiggyBank {
        private double savings = 0;
        private final String id;
        PiggyBank(String id) { this.id = id; }
        void deposit(double amount) { if (amount > 0) savings += amount; }
        boolean withdraw(double amount) {
            if (amount > 0 && amount <= savings) { savings -= amount; return true; }
            return false;
        }
        double getSavings() { return savings; }
    }
    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        pb.deposit(100);
        System.out.println(pb.getSavings());
        pb.withdraw(30);
        System.out.println(pb.getSavings());
        pb.withdraw(500);
        System.out.println(pb.getSavings());
    }
}
