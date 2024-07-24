import java.util.*;

public class P12 {
    public static void main(String[] args) {
        if (args.length == 1) { 
                                              // Command-line argument
            double amount = Double.parseDouble(args[0]);
            double rupees = amount*100;
            System.out.println(amount + " Pounds = " + rupees + " Rupees");
        }
 else {
                                              // Interactive mode
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter amount in Pounds: ");
            double amount = scanner.nextDouble();
            double rupees = amount*100;
            System.out.println(amount + " Pounds = " + rupees + " Rupees");
        }
System.out.println("23DCS028 KASHISH GANDHI");
    }

    }

