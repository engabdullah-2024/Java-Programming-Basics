public class Product{
    public static void main(String[] args) {
        String name ="Cake";
        double price = 1.5;
        int quantity_in_stock = 5;
          boolean isAvailabe = true;
          char size = 'L';
          double tax_rate = 0.05 ;
        double tax_amount = price * tax_rate;
        double total = price + tax_amount;
       
          
        System.out.println("Item Name : "  + name);
        System.out.println("Quantity In Stock : "  + quantity_in_stock);
        System.out.println("In Stock : "  + isAvailabe);
        System.out.println("Size : "  + size);
        System.out.println("Price $ : "  + price);
        System.out.println("Tax Rate : "  + tax_rate);
        System.out.println("Total  $ : "  + total);
        




        

    }
}