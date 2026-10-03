public class W7A3PasswordChecker {
    static class PasswordChecker {
        private final String password;
        PasswordChecker(String password) { this.password = password; }
        String getStrength() {
            if (password.length() < 6) return "Weak";
            if (password.length() < 10) return "Medium";
            return "Strong";
        }
    }
    public static void main(String[] args) {
        System.out.println(new PasswordChecker("abcd").getStrength());
        System.out.println(new PasswordChecker("abcdefghij").getStrength());
    }
}
