import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P29_1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java P29_1 <word> <filename>");
            return;
        }

        
        String searchWord = args[0];  
        String fileName = args[1];    

        int lineNumber = 0;
        boolean found = false;

        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.contains(searchWord)) {
                    System.out.println("Word '" + searchWord + "' found at line " + lineNumber + ": " + line);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Word '" + searchWord + "' not found in the file.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
        }
    }
}
