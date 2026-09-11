public class W2A4IsbnValidator {
    static String normalizeCode(String raw) {
        String value = raw.trim();
        return value.length() < 3 ? value : value.substring(0, 3).toUpperCase() + value.substring(3);
    }
    static String validateAndFormat(String code) {
        if (code.length() != 13) return "Invalid: wrong length";
        for (int i = 0; i < 3; i++) if (!Character.isLetter(code.charAt(i))) return "Invalid: publisher code must be 3 letters";
        for (int i = 3; i < 13; i++) if (!Character.isDigit(code.charAt(i))) return "Invalid: body must contain only digits";
        return new StringBuilder("[").append(code, 0, 3).append("] YEAR: ").append(code, 3, 7)
                .append(" | CATALOG: ").append(code.substring(7)).toString();
    }
    public static void main(String[] args) { System.out.println(validateAndFormat(normalizeCode(" pen2026004251 "))); }
}
