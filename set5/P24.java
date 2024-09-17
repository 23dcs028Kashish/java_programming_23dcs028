import java.util.*;
public class P24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter the first integer (x): ");
            int x = scanner.nextInt();
            System.out.print("Enter the second integer (y): ");
            int y = scanner.nextInt();

            
            int result = x / y;
            System.out.println("The result of x / y is: " + result);

        } catch (InputMismatchException e) {
            
            System.out.println("Please enter valid integers.");

        } catch (ArithmeticException e) {
          
            System.out.println("Division by zero is not allowed.");

        } finally {
            
            scanner.close();
        }
    }
    
}
