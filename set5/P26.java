/*Write a java program to generate user defined exception
using “throw” and “throws” keyword.
Also Write a java that differentiates checked and
unchecked exceptions. (Mention at least two checked and
two unchecked exceptions in program). */
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class P26 {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18. Access denied.");
        } else {
            System.out.println("Access granted. Age is: " + age);
        }
    }

    public static void divide(int a, int b) {
        if (b == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed.");
        } else {
            System.out.println("Result of division is: " + (a / b));
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }

        try {
            checkAge(20);
        } catch (InvalidAgeException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }

        try {
            divide(10, 0);
        } catch (DivisionByZeroException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }

        try {
            divide(10, 2);
        } catch (DivisionByZeroException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }

        try {
            int[] arr = new int[2];
            int x = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
