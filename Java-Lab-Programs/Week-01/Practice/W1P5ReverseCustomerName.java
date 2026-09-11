public class W1P5ReverseCustomerName {
    static String reverseCustomerName(String customerName) {
        StringBuilder reverse = new StringBuilder();
        for (int i = customerName.length() - 1; i >= 0; i--) reverse.append(customerName.charAt(i));
        return reverse.toString();
    }
    public static void main(String[] args) {
        String name = "Sunil";
        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reverseCustomerName(name));
    }
}
