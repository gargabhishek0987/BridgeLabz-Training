package Collections.ShoppingCart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {

    private Map<String, Double> productPrices;

    private Map<String, Integer> itemsInCartLinked;

   
    private Map<Product, Integer> itemsInCartTree;

    // A helper map to quickly get Product objects by their ID
    private Map<String, Product> productCatalog;

    public ShoppingCart() {
        productPrices = new HashMap<>();
        itemsInCartLinked = new LinkedHashMap<>();
        itemsInCartTree = new TreeMap<>();
        productCatalog = new HashMap<>();

        productPrices.put("P001", 1200.00);
        productPrices.put("P002", 75.00);
        productPrices.put("P003", 250.00);
     

        productCatalog.put("P001", new Product("P001", "Laptop", 1200.00));
        productCatalog.put("P002", new Product("P002", "Keyboard", 75.00));
        productCatalog.put("P003", new Product("P003", "Desk Chair", 250.00));

    }

    // Add item to cart
    public void addItem(String productId, int quantity) {
        if (!productPrices.containsKey(productId)) {
            System.out.println("Product with ID " + productId + " not found.");
            return;
        }
        if (quantity <= 0) {
            System.out.println("Quantity must be positive.");
            return;
        }

        // Update LinkedHashMap
        itemsInCartLinked.put(productId, itemsInCartLinked.getOrDefault(productId, 0) + quantity);

        // Update TreeMap
        Product product = productCatalog.get(productId);
        if (product != null) {
            itemsInCartTree.put(product, itemsInCartTree.getOrDefault(product, 0) + quantity);
        }

        System.out.println("Added " + quantity + " of " + product.getName() + " to cart.");
    }

    public void removeItem(String productId) {
        if (!itemsInCartLinked.containsKey(productId)) {
            System.out.println("Product with ID " + productId + " not in cart.");
            return;
        }

        int quantityRemoved = itemsInCartLinked.remove(productId);
        Product product = productCatalog.get(productId);
        if (product != null) {
            itemsInCartTree.remove(product);
        }
        System.out.println("Removed product " + product.getName() + " from cart.");
    }

    public void displayCartLinkedHashMap() {
        if (itemsInCartLinked.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        double total = 0;
        for (Map.Entry<String, Integer> entry : itemsInCartLinked.entrySet()) {
            String productId = entry.getKey();
            int quantity = entry.getValue();
            Product product = productCatalog.get(productId);
            if (product != null) {
                double itemTotal = product.getPrice() * quantity;
                System.out.printf("%s (ID: %s) x %d @ $%.2f = $%.2f%n", product.getName(), productId, quantity, product.getPrice(), itemTotal);
                total += itemTotal;
            }
        }
        System.out.printf("Total: $%.2f%n", total);
    }

    public void displayCartTreeMap() {
        if (itemsInCartTree.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        double total = 0;
        for (Map.Entry<Product, Integer> entry : itemsInCartTree.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            double itemTotal = product.getPrice() * quantity;
            System.out.printf("%s (ID: %s) x %d @ $%.2f = $%.2f%n", product.getName(), product.getProductId(), quantity, product.getPrice(), itemTotal);
            total += itemTotal;
        }
        System.out.printf("Total: $%.2f%n", total);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : itemsInCartLinked.entrySet()) {
            String productId = entry.getKey();
            int quantity = entry.getValue();
            Double price = productPrices.get(productId);
            if (price != null) {
                total += price * quantity;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();


        cart.addItem("P001", 1); 
        cart.addItem("P006", 2);
        cart.addItem("P003", 1); 
        cart.addItem("P002", 1); 
        cart.addItem("P006", 1); 

        cart.displayCartLinkedHashMap();
        cart.displayCartTreeMap();

        System.out.println("\nTotal price of items in cart: $" + String.format("%.2f", cart.calculateTotalPrice()));

        cart.removeItem("P006"); // Remove all mice
        cart.displayCartLinkedHashMap();
        cart.displayCartTreeMap();

        cart.addItem("P007", 1); // Non-existent product
    }
}