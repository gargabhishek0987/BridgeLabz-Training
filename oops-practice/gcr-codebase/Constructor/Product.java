public class Product {
    private String productName;
    private double price;
    private static int totalProduct;



    public Product(String productName, double price){
        this.productName = productName;
        this.price = price;
        totalProduct++;

    }

    public static void displayProductDetails() {
        System.out.println("Total products " + totalProduct);
    }
    public static int totalProducts() {
        return totalProduct;
    }

}