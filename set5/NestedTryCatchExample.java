public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
           
            int[] numbers = {1, 2, 3};
            int a = 10, b = 0;
            
            
            try {
                int result = a / b; // This will throw ArithmeticException
                System.out.println("Result of division: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            }

            
            try {
                int invalidAccess = numbers[5]; // This will throw ArrayIndexOutOfBoundsException
                System.out.println("Array element: " + invalidAccess);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            }

           
            try {
                String invalidNumber = "abc";
                int number = Integer.parseInt(invalidNumber); // This will throw NumberFormatException
                System.out.println("Converted number: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Caught NumberFormatException: " + e.getMessage());
            }

        } catch (Exception e) {
            
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
