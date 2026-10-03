public class W7A5ShoppingCart {
    static class Cart {
        private final double[] prices;
        private int count = 0;
        private final String cartId;
        Cart(String id, int size) { cartId = id; prices = new double[size]; }
        void addItem(double price) { if (count < prices.length) prices[count++] = price; }
        double getTotal() {
            double total = 0;
            for (int i = 0; i < count; i++) total += prices[i];
            return total;
        }
        int getItemCount() { return count; }
    }
    public static void main(String[] args) {
        Cart c = new Cart("CART-5", 20);
        c.addItem(250); c.addItem(99); c.addItem(151);
        System.out.println(c.getTotal());
        System.out.println(c.getItemCount());
    }
}
