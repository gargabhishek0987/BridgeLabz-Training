public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return (3.14 * radius * radius);
    }

    public double circumference() {
        return (2 * radius * radius);
    }

    public static void main(String[] args) {
        Circle c = new Circle(2.5);
        c.area();
        c.circumference();

    }
    
}
