/*Create a class named 'Rectangle' with two data members
'length' and 'breadth' and two methods to print the area and
perimeter of the rectangle respectively. Its constructor
having parameters for length and breadth is used to
initialize length and breadth of the rectangle. Let class
'Square' inherit the 'Rectangle' class with its constructor
having a parameter for its side (suppose s) calling the
constructor of its parent class as 'super(s,s)'. Print the area
and perimeter of a rectangle and a square. Also use array
of objects.*/ 
// Class P19
class Rectangle {
    double length, breadth;

    // Constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to print area
    void printArea() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    // Method to print perimeter
    void printPerimeter() {
        System.out.println("Perimeter of Rectangle: " + 2 * (length + breadth));
    }
}

// Class Square inheriting Rectangle
class Square extends Rectangle {
    // Constructor
    Square(double side) {
        super(side, side);
    }
}
public class P19 {
    public static void main(String[] args) {
        // Array of objects
        Rectangle[] rectangles = new Rectangle[2];

        // Creating objects
        rectangles[0] = new Rectangle(5, 10);
        rectangles[1] = new Square(5);

        // Printing area and perimeter
        for (Rectangle rectangle : rectangles) {
            rectangle.printArea();
            rectangle.printPerimeter();
            System.out.println();
        }
    }
}
