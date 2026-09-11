public class W2P3FileExtensionValidator {
    static String validateFileExtension(String filename) {
        int dot = filename.lastIndexOf('.');
        if (dot == -1 || dot == filename.length() - 1) return "Rejected - invalid file type";
        String extension = filename.substring(dot + 1);
        return (extension.equalsIgnoreCase("pdf") || extension.equalsIgnoreCase("docx") || extension.equalsIgnoreCase("zip"))
                ? "Accepted" : "Rejected - invalid file type";
    }
    public static void main(String[] args) { System.out.println(validateFileExtension("Assignment1.PDF")); }
}
