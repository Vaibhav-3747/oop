import java.util.Scanner;
class Product {
    String name;
    double price;
    int quantity;

    // Constructor 1: Default Product
    Product() {
        name = "Unknown";
        price = 0.0;
        quantity = 0;
    }

    // Constructor 2: Initialize with name and price
    Product(String name, double price) {
        this.name = name;
        this.price = price;
        quantity = 1; // default quantity
    }
    // Constructor 3: Initialize with full details
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    double getTotalCost() {
        return price * quantity;
    }    

// Static method to apply discount
    static double applyDiscount(double total) {
         if (total > 15000)
            return total-total * 0.25;
        else if (total > 10000)
            return total-total * 0.20;
        else if (total > 5000)
            return total-total * 0.15;
        else
            return total;    }

    // Method to display product details
    void displayProduct() {
        System.out.println(  name + " | Price: " + price + " | Quantity: " + quantity +  " | Total: " + price * quantity );
    }
}
 // Main class
public class Ecommerce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product p=new Product();

       // Product p1 = new Product("powerbank ", 800);
        //Product p2 = new Product("Headphones", 150, 2);

        // User input
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        Product userProduct = new Product(name, price, quantity);
        // Display order summary
        System.out.println("\nOrder Summary:");
        //p1.displayProduct();
        //p2.displayProduct();
        userProduct.displayProduct();

        // Calculate total and discount
        double totalCost = userProduct.getTotalCost();
        double finalAmount = Product.applyDiscount(totalCost);
        System.out.println("\nTotal Cost Before Discount: " + totalCost);
        System.out.println("Final Price After Discount: " + finalAmount);
        System.out.println("Thank you for shopping!");
        scanner.close();
    }
}
