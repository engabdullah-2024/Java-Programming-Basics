
public class Order {
    public static void main(String[] args) {
        double price = 4.5;
        int quantityInStock = 10;
        int quantityOrdered = 6;
        String customerType = "regular";

        double total = price * quantityOrdered;

        if (total > 20) {
            System.out.println("Free delivery!");
        }

        System.out.println("Total : " + total);
        System.out.println("Customer Type : " + customerType);
    }
}
