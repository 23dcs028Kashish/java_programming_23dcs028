// Shape.java
interface Shape {
    String getColor();
    double getArea();
    
    default void printDetails() {
        System.out.println("Color: " + getColor());
        System.out.println("Area: " + getArea());
    }
}

// Circle.java
 class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle.java
 class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

// Sign.java
 class Sign {
    private Shape backgroundShape;
    private String text;

    public Sign(Shape backgroundShape, String text) {
        this.backgroundShape = backgroundShape;
        this.text = text;
    }

    public void display() {
        System.out.println("Sign Text: " + text);
        System.out.println("Background Shape Details:");
        backgroundShape.printDetails();
    }
}

// Main.java
public class P23 {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Red");
        Shape rectangle = new Rectangle(4, 6, "Blue");
        
        Sign sign1 = new Sign(circle, "Welcome to the Campus!");
        Sign sign2 = new Sign(rectangle, "Library Entrance");

        System.out.println("Sign 1:");
        sign1.display();

        System.out.println("\nSign 2:");
        sign2.display();
    }
}