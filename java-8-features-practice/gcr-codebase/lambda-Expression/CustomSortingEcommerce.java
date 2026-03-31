import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomSortingEcommerce {

    static class Product {
        String name;
        double price;
        double rating;
        double discount;

        Product(String name, double price, double rating, double discount) {
            this.name = name;
            this.price = price;
            this.rating = rating;
            this.discount = discount;
        }

        public String toString() {
            return name + " Price " + price +"  Rating " + rating +"Discount " + discount + "%";
        }
    }

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
            new Product("Laptop", 60000, 4.5, 10),
            new Product("Mobile", 30000, 4.7, 15),
            new Product("Headphones", 2000, 4.2, 25),
            new Product("Tablet", 25000, 4.3, 5)
        );

        String campaign = "RATING";  

        Comparator<Product> comparator;

        if (campaign.equals("PRICE")) {
            comparator = (p1, p2) -> Double.compare(p1.price, p2.price);
        } 
        else if (campaign.equals("RATING")) {
            comparator = (p1, p2) -> Double.compare(p2.rating, p1.rating);
        } 
        else {
            comparator = (p1, p2) -> Double.compare(p2.discount, p1.discount);
        }

        Collections.sort(products, comparator);

        for (Product p : products) {
            System.out.println(p);
        }
    }
}
