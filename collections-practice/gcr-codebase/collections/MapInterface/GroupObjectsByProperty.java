package Collections.MapInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', category='" + category + "', price=" + price + "}";
    }
}

public class GroupObjectsByProperty {

    // Method to group a list of Products by their category
    public static Map<String, List<Product>> groupProductsByCategory(List<Product> products) {
        Map<String, List<Product>> groupedProducts = new HashMap<>();

        if (products == null || products.isEmpty()) {
            return groupedProducts;
        }

        for (Product product : products) {
            String category = product.getCategory();
           
            groupedProducts.computeIfAbsent(category, k -> new ArrayList<>()).add(product);
        }
        return groupedProducts;
    }

    public static Map<String, List<Product>> groupProductsByCategoryStream(List<Product> products) {
        if (products == null || products.isEmpty()) {
            return new HashMap<>();
        }
        return products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Electronics", 1200.00));
        products.add(new Product("Keyboard", "Electronics", 75.00));
        products.add(new Product("Desk Chair", "Furniture", 250.00));
     

        System.out.println("Original Products List:");
        products.forEach(System.out::println);

        Map<String, List<Product>> groupedByLoop = groupProductsByCategory(products);
        groupedByLoop.forEach((category, productList) -> {
            System.out.println("\nCategory: " + category);
            productList.forEach(System.out::println);
        });

        Map<String, List<Product>> groupedByStream = groupProductsByCategoryStream(products);
        groupedByStream.forEach((category, productList) -> {
            System.out.println("\nCategory: " + category);
            productList.forEach(System.out::println);
        });


        List<Product> emptyList = new ArrayList<>();
        System.out.println("Grouping empty list (Loop): " + groupProductsByCategory(emptyList));
        System.out.println("Grouping empty list (Stream): " + groupProductsByCategoryStream(emptyList));


        List<Product> nullList = null;
        System.out.println("Grouping null list (Loop): " + groupProductsByCategory(nullList));
        System.out.println("Grouping null list (Stream): " + groupProductsByCategoryStream(nullList));
    }
}