import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P30 {
    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.out.println("Usage: java P30 <source file> <destination file>");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        try (FileReader reader = new FileReader(sourceFile); FileWriter writer = new FileWriter(destinationFile)) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);  
            }
            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);
        } catch (IOException e) {
            System.out.println("Error while copying file: " + e.getMessage());
        }
    }
}
