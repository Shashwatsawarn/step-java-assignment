public class W2P5BankReferenceValidator {
    static String normalizeReference(String raw) {
        String value = raw.trim();
        return value.length() < 3 ? value : value.substring(0, 3).toUpperCase() + value.substring(3);
    }
    static String validateAndFormat(String reference) {
        if (reference.length() != 14) return "Invalid: wrong length";
        for (int i = 0; i < 3; i++) if (!Character.isLetter(reference.charAt(i))) return "Invalid: bank code must be 3 letters";
        for (int i = 3; i < 14; i++) if (!Character.isDigit(reference.charAt(i))) return "Invalid: body must contain only digits";
        return new StringBuilder("[").append(reference, 0, 3).append("] DATE: ")
                .append(reference, 3, 5).append('/').append(reference, 5, 7).append('/').append(reference, 7, 9)
                .append(" | SEQ: ").append(reference.substring(9)).toString();
    }
    public static void main(String[] args) { System.out.println(validateAndFormat(normalizeReference(" hdf03022600042 "))); }
}
