public class W1A1DuplicateSeats {
    static void checkDuplicateSeats(int[] seatNumbers) {
        boolean found = false;
        for (int i = 0; i < seatNumbers.length; i++) {
            boolean printedEarlier = false;
            for (int k = 0; k < i; k++) if (seatNumbers[k] == seatNumbers[i]) printedEarlier = true;
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j] && !printedEarlier) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    found = true; break;
                }
            }
        }
        if (!found) System.out.println("No Duplicate Seats Found");
    }
    public static void main(String[] args) { checkDuplicateSeats(new int[]{101, 102, 103, 102, 105}); }
}
