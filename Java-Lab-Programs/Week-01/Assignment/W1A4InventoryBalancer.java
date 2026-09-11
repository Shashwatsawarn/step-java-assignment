public class W1A4InventoryBalancer {
    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0, max = Integer.MIN_VALUE, maxIndex = -1; String maxSection = "";
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i]; totalB += sectionB[i];
            if (sectionA[i] > max) { max = sectionA[i]; maxIndex = i; maxSection = "A"; }
            if (sectionB[i] > max) { max = sectionB[i]; maxIndex = i; maxSection = "B"; }
        }
        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB
                + " | Status: " + (totalA == totalB ? "Balanced" : "Not Balanced")
                + " | Highest Quantity: " + max + " (Section " + maxSection + ", Item " + (maxIndex + 1) + ")");
    }
    public static void main(String[] args) { analyzeInventory(new int[]{20, 15, 30}, new int[]{25, 10, 30}); }
}
